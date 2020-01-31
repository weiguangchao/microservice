package com.ririiy.cloud;

import com.ririiy.ribbon.DeptConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "MICROSERVICE-DEPT", configuration = DeptConfiguration.class)
public class Dept80_Consumer {

    public static void main(String[] args) {
        SpringApplication.run(Dept80_Consumer.class, args);
    }

}
