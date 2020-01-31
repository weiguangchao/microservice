package com.ririiy.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class Dept8000_hystrix_Provider {

    public static void main(String[] args) {
        SpringApplication.run(Dept8000_hystrix_Provider.class, args);
    }

}
