package com.zpp.ztv;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Handler;
import android.os.Looper;

import com.koushikdutta.async.AsyncServer;
import com.koushikdutta.async.http.server.AsyncHttpServer;
import com.koushikdutta.async.http.server.AsyncHttpServerRequest;
import com.koushikdutta.async.http.server.AsyncHttpServerResponse;
import com.koushikdutta.async.http.WebSocket;
import com.koushikdutta.async.http.body.UrlEncodedFormBody;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class WebServer {

    private final Context context;
    private final int port;
    private WebServerListener listener;
    private AsyncHttpServer httpServer;
    private final List<WebSocket> connectedWebSockets = new CopyOnWriteArrayList<>();
    private Handler mainHandler = new Handler(Looper.getMainLooper());
    private String connectedClientIp = null;

    public WebServer(Context context, int port) {
        this.context = context.getApplicationContext();
        this.port = port;
        this.httpServer = new AsyncHttpServer();
    }

    public void setListener(WebServerListener listener) {
        this.listener = listener;
    }

    /** 开启服务 */
    public void startServer() {
        try {
            setupRoutes();
            httpServer.listen(AsyncServer.getDefault(), port);
            String localIp = getLocalIpAddress();
            String url = "http://" + localIp + ":" + port + "/";
            if (listener != null) mainHandler.post(() -> listener.onServerStarted(url));
        } catch (Exception e) {
            e.printStackTrace();
            if (listener != null) mainHandler.post(() -> listener.onServerError(e));
        }
    }

    /** 停止服务 */
    public void stopServer() {
        if (httpServer != null) {
            httpServer.stop();
        }
        connectedWebSockets.clear();
        connectedClientIp = null;
        if (listener != null) mainHandler.post(listener::onServerStopped);
    }

    /** 从 Android 主动将数据推送到 Web 客户端 */
    public void pushDataToWeb(JSONObject data) {
        for (WebSocket webSocket : connectedWebSockets) {
            if (webSocket != null && webSocket.isOpen()) {
                webSocket.send(data.toString());
                System.out.println("数据已通过WebSocket推送到客户端：" + data.toString());
            }
        }
    }

    /** 绑定 HTTP 请求路由 */
    private void setupRoutes() {
        httpServer.get("/", (request, response) -> {
            String clientIp = getClientIpFromRequest(request);
            if (connectedClientIp == null) {
                connectedClientIp = clientIp;
                System.out.println("第一个客户端连接，IP: " + connectedClientIp);
            } else if (!connectedClientIp.equals(clientIp)) {
                System.out.println("访问被拒绝，IP: " + clientIp);
                response.code(403);
                response.send("访问被拒绝，只允许一个外部设备连接。");
                return;
            }

            try {
                String htmlContent = loadHtmlFromAssets("index.html");
                response.send("text/html", htmlContent);
            } catch (IOException e) {
                response.code(500);
                response.send("text/plain", "加载网页失败");
            }
        });

        httpServer.post("/submit", (request, response) -> {
            String clientIp = getClientIpFromRequest(request);
            if (!connectedClientIp.equals(clientIp)) {
                response.code(403);
                response.send("访问被拒绝。");
                return;
            }

            UrlEncodedFormBody body = (UrlEncodedFormBody) request.getBody();
            if (body != null) {
                Map<String, List<String>> params = body.get();
                if (params != null && params.containsKey("input")) {
                    String input = params.get("input").get(0);
                    if (listener != null) {
                        mainHandler.post(() -> listener.onWebDataReceived(input));
                    }
                    JSONObject jsonResponse = new JSONObject();
                    try {
                        jsonResponse.put("status", "ok");
                        jsonResponse.put("message", "数据已收到");
                    } catch (JSONException e) { e.printStackTrace(); }
                    response.send("application/json", jsonResponse.toString());
                } else {
                    response.code(400);
                    response.send("text/plain", "请求体中缺少input参数");
                }
            } else {
                response.code(400);
                response.send("text/plain", "请求体为空");
            }
        });

        httpServer.post("/save", (request, response) -> {
            String clientIp = getClientIpFromRequest(request);
            if (!connectedClientIp.equals(clientIp)) {
                response.code(403);
                response.send("访问被拒绝。");
                return;
            }

            UrlEncodedFormBody body = (UrlEncodedFormBody) request.getBody();
            if (body != null) {
                Map<String, List<String>> params = body.get();
                if (params != null && params.containsKey("user")) {
                    String userId = params.get("user").get(0);
                    if (listener != null) {
                        mainHandler.post(() -> listener.onUserSaved(userId));
                    }
                    response.send("text/plain", "User saved successfully");
                } else {
                    response.code(400);
                    response.send("text/plain", "请求体中缺少user参数");
                }
            } else {
                response.code(400);
                response.send("text/plain", "请求体为空");
            }
        });

        httpServer.websocket("/ws", (webSocket, request) -> {
            String clientIp = getClientIpFromRequest(request);

            if (connectedClientIp != null && !connectedClientIp.equals(clientIp)) {
                System.out.println("WebSocket访问被拒绝，IP: " + clientIp);
                webSocket.close();
                return;
            }

            System.out.println("WebSocket连接建立，客户端IP: " + clientIp);
            connectedWebSockets.add(webSocket);

            webSocket.setClosedCallback(ex -> {
                if (ex != null) {
                    System.out.println("WebSocket连接异常断开: " + ex.getMessage());
                } else {
                    System.out.println("WebSocket连接已正常断开。");
                }
                connectedWebSockets.remove(webSocket);
            });

            webSocket.setStringCallback(s -> {
                System.out.println("收到来自客户端的WebSocket消息: " + s);
            });
        });
    }

    /**
     * 从请求头获取客户端IP地址。
     * 这是一种更可靠的方法，因为它不依赖于可能不存在的 `getRemoteAddress()` 方法。
     */
    private String getClientIpFromRequest(AsyncHttpServerRequest request) {
        String ip = request.getHeaders().get("remote-addr");
        if (ip == null) {
            ip = request.getHeaders().get("X-Real-IP");
        }
        if (ip == null) {
            ip = request.getHeaders().get("X-Forwarded-For");
        }
        return (ip != null) ? ip : "unknown";
    }

    private String getLocalIpAddress() {
        try {
            for (Enumeration<NetworkInterface> en = NetworkInterface.getNetworkInterfaces(); en.hasMoreElements();) {
                NetworkInterface intf = en.nextElement();
                for (Enumeration<InetAddress> enumIpAddr = intf.getInetAddresses(); enumIpAddr.hasMoreElements();) {
                    InetAddress inetAddress = enumIpAddr.nextElement();
                    if (!inetAddress.isLoopbackAddress() && inetAddress.getHostAddress().indexOf(':') < 0) {
                        return inetAddress.getHostAddress();
                    }
                }
            }
        } catch (Exception ex) { ex.printStackTrace(); }
        return "127.0.0.1";
    }

    private String loadHtmlFromAssets(String fileName) throws IOException {
        AssetManager manager = context.getAssets();
        try (InputStream is = manager.open(fileName);
             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) sb.append(line).append("\n");
            return sb.toString();
        }
    }

    public interface WebServerListener {
        void onServerStarted(String url);
        void onServerStopped();
        void onServerError(Exception e);
        void onWebDataReceived(String data);
        void onUserSaved(String userId);
    }
}