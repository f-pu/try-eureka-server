package com.example.tryeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author FPU1
 */
@SpringBootApplication
@EnableEurekaServer
public class TryEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TryEurekaServerApplication.class, args);
    }

}
