package com.didispace.scca.ui.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SccaDbUIRestServer {

    public static void main(String[] args) {
        SpringApplication.run(SccaDbUIRestServer.class, args);
        
        //test123你好
    }

}
