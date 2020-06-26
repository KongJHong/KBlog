package com.hong.kblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author : KongJHong
 * @Date : 2020-06-25 1:42
 * @Version : 1.0
 * Description     : 启动类
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.hong"})
public class RunApplication {
     public static void main(String[] args) {
        SpringApplication.run(RunApplication.class,args);
    }
}
