package com.gree.qds.qdscloudzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy  //开启zuul代理
@EnableEurekaClient //zuul服务要注册到Eureka上
public class QdsCloudZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(QdsCloudZuulApplication.class, args);
    }

}
