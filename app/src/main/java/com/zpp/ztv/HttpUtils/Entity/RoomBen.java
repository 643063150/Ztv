package com.zpp.ztv.HttpUtils.Entity;

import java.util.List;

public class RoomBen {

    /**
     * code : 200
     * router : /api/douyin/web/get_all_webcast_id
     * data : ["775841227732","775841227732","7318296342189919011","7318296342189919011","7318296342189919011"]
     */

    private int code;
    private String router;
    private List<String> data;

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

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }
}
