package com.vivebest.controller;

import com.vivebest.common.msg.MsgContents;
import com.vivebest.common.utils.ResposeUtil;
import com.vivebest.entity.base.HttpContentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * 请求接入控制类
 *
 * @author he.wj
 * @create 2017-12-27 19:49
 **/

@RequestMapping("/generator/code/v1")
@RestController
public class AccessRequestController  {

    @Value("${spring.application.name}")
    private String appName;

    @Value("${commonUrl}")
    private String commonUrl;

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/getAccessRequest")
    public Object getAccessRequest(@RequestBody HttpContentRequest httpRequest){

        String url = "http://"+appName.toUpperCase()+"/"+commonUrl+httpRequest.getApi();
        String httpType = httpRequest.getType();
        if(MsgContents.HTTP_GET.equalsIgnoreCase(httpType)){
           return restTemplate.getForObject(url,Object.class);
        }else if(MsgContents.HTTP_POST.equalsIgnoreCase(httpType)){
           return  restTemplate.postForEntity(url,httpRequest.getData(),Object.class);
        }else if(MsgContents.HTTP_PUT.equalsIgnoreCase(httpType)){
            restTemplate.put(url,httpRequest.getData(),Object.class);
            return ResposeUtil.putResponseDate();
        }else if(MsgContents.HTTP_DELETE.equalsIgnoreCase(httpType)){
            restTemplate.delete(url,null,Object.class);
            return ResposeUtil.putResponseDate();
        }
        return  null;
    }
}

