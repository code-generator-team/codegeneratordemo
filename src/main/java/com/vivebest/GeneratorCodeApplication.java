package com.vivebest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * 启动程序类
 *
 * @author he.wj
 * @create 2017-12-22 22:40
 **/
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.vivebest.mapper.*")
public class GeneratorCodeApplication {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        RestTemplate template = new RestTemplate();
        SimpleClientHttpRequestFactory factory = (SimpleClientHttpRequestFactory) template.getRequestFactory();
        factory.setConnectTimeout(3000);
        factory.setReadTimeout(3000);
        return template;
    }


    public static void main(String[] args) {
        SpringApplication.run(GeneratorCodeApplication.class,args);
    }
}
