package com.zpp.ztv.Utils;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.widget.ImageView;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

import java.util.HashMap;
import java.util.Map;
public class DisplayQRCode {


// ...你的其他代码

    /**
     * 使用ZXing核心库生成二维码并显示在ImageView上
     * @param content 要生成二维码的文本内容
     * @param imageView 用于显示二维码的 ImageView
     */
    public static void generateAndDisplayQRCode(String content, ImageView imageView) {
        try {
            // 设置二维码参数
            Map<EncodeHintType, Object> hints = new HashMap<>();
            // 设置二维码的纠错级别，L、M、Q、H，H级别最高
            hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);
            // 设置编码方式
            hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");

            // 使用QRCodeWriter生成二维码的BitMatrix
            Writer writer = new QRCodeWriter();
            BitMatrix bitMatrix = writer.encode(content, BarcodeFormat.QR_CODE, 400, 400, hints);

            int width = bitMatrix.getWidth();
            int height = bitMatrix.getHeight();
            int[] pixels = new int[width * height];

            for (int y = 0; y < height; y++) {
                int offset = y * width;
                for (int x = 0; x < width; x++) {
                    // 如果该位置有像素，则设置黑色，否则白色
                    pixels[offset + x] = bitMatrix.get(x, y) ? Color.BLACK : Color.WHITE;
                }
            }

            // 创建Bitmap对象
            Bitmap bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.RGB_565);
            bitmap.setPixels(pixels, 0, width, 0, 0, width, height);

            // 显示在ImageView上
            imageView.setImageBitmap(bitmap);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
