package com.zpp.ztv.HttpUtils.Entity;

public class UserIdBen {

    /**
     * code : 200
     * router : /api/douyin/web/get_sec_user_id
     * data : MS4wLjABAAAAPiFxgu7K5KtUTCYPDAKOT0s4UWBoDuWVRq_chfF9fsU
     */

    private int code;
    private String router;
    private String data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getRouter() {
        return router;
    }

    public void setRouter(String router) {
        this.router = router;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
