package com.vivebest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 启动程序类
 *
 * @author he.wj
 * @create 2017-12-22 22:40
 **/
@SpringBootApplication
@MapperScan("com.vivebest.mapper.*")
public class GeneratorCodeApplication {
    public static void main(String[] args) {
        SpringApplication.run(GeneratorCodeApplication.class,args);
    }
}
