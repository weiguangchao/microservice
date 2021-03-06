package com.ririiy.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Eureka3001_App {

    public static void main(String[] args) {
        SpringApplication.run(Eureka3001_App.class, args);
    }

}
