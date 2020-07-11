package com.gree.qds.qdscloudconsumerfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringCloudApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.gree.qds.qdscloudconsumerfeign.*")
public class QdsCloudConsumerFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(QdsCloudConsumerFeignApplication.class, args);
    }

}
