package com.gree.qds.qdscloudconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class QdsCloudConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(QdsCloudConsumerApplication.class, args);
    }

}
