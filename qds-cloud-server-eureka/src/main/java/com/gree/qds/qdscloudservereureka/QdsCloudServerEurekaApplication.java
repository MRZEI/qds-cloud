package com.gree.qds.qdscloudservereureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //标明为一个server
public class QdsCloudServerEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(QdsCloudServerEurekaApplication.class, args);

        System.out.println("---服务监控访问地址"+"http://localhost:8761");
    }

}
