package com.vivebest.common.utils;

import com.vivebest.common.msg.MsgContents;
import com.vivebest.entity.base.ResponseData;

import java.util.HashMap;
import java.util.Map;

/**
 * 响应报文工具类
 * @author he.wj
 * @create 2017-12-24 12:11
 **/
public class ResposeUtil {

    public static ResponseData putResponseDate(Object respData){
        ResponseData responseData = new ResponseData();
        responseData.setResposeCode(MsgContents.SUCESS_CODE);
        responseData.setResposeMsg(MsgContents.SUCESS_DESC);
        responseData.setData(respData);
        return responseData;
    }

    public static ResponseData putResponseDate(){
        return putResponseDate("");
    }


}
