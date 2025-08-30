package com.zpp.ztv.HttpUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 通用请求体，可使用 Map<String,Object> 封装字段
 */
public class CommonBody {
    private Map<String, Object> params = new HashMap<>();

    public CommonBody() {}

    public CommonBody addParam(String key, Object value) {
        params.put(key, value);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

