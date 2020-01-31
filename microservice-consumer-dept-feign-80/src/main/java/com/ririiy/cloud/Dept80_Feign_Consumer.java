package com.ririiy.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class Dept80_Feign_Consumer {

    public static void main(String[] args) {
        SpringApplication.run(Dept80_Feign_Consumer.class, args);
    }

}
