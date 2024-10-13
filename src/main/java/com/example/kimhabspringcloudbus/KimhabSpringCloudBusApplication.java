package com.example.kimhabspringcloudbus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class KimhabSpringCloudBusApplication {

    public static void main(String[] args) {
        SpringApplication.run(KimhabSpringCloudBusApplication.class, args);
    }

}
