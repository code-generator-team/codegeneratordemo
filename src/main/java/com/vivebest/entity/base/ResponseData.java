package com.vivebest.entity.base;

/**
 * 响应数据
 * @author he.wj
 * @create 2017-12-24 12:19
 **/
public class ResponseData<T> {

    /**
     * 响应码
     */
    private String resposeCode;

    /**
     * 响应描述
     */
    private String resposeMsg;

    /**
     * 响应数据
     */
    private  T data;

    public String getResposeCode() {
        return resposeCode;
    }

    public String getResposeMsg() {
        return resposeMsg;
    }

    public T getData() {
        return data;
    }

    public void setResposeCode(String resposeCode) {
        this.resposeCode = resposeCode;
    }

    public void setResposeMsg(String resposeMsg) {
        this.resposeMsg = resposeMsg;
    }

    public void setData(T data) {
        this.data = data;
    }
}
