package com.vivebest.entity.base;

import java.io.Serializable;

/**
 * 统一请求实体类
 *
 * @author he.wj
 * @create 2017-12-27 19:44
 **/
public class HttpContentRequest implements Serializable {

    /**
     * 请求应用名称
     */
    private String api;

    /**
     * 请求类型
     */
    private String type;

    /**
     * 请求数据
     */
    private Object data;

    public String getApi() {
        return api;
    }

    public String getType() {
        return type;
    }

    public Object getData() {
        return data;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "HttpContentRequest{" +
                "api='" + api + '\'' +
                ", type='" + type + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
