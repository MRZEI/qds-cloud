package com.gree.qds.qdscloudprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //表明这是一个eureka客户端
public class QdsCloudProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(QdsCloudProviderApplication.class, args);
    }

}
