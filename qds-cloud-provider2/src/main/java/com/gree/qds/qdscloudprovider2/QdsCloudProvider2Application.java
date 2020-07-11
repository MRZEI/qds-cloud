package com.gree.qds.qdscloudprovider2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //表明这是一个eureka客户端
public class QdsCloudProvider2Application {

    public static void main(String[] args) {
        SpringApplication.run(QdsCloudProvider2Application.class, args);
    }

}
