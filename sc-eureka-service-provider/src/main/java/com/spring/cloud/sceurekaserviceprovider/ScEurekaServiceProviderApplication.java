package com.spring.cloud.sceurekaserviceprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ScEurekaServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScEurekaServiceProviderApplication.class, args);
    }

}
