package com.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerLocalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerLocalApplication.class, args);
		
		System.out.println("@EnableConfigServer");
		System.out.println("EnableConfigSerdver");
		System.out.println("EnableConfigSerdver application is used for config  a server into remote location");
		System.out.println("EnableConfigSerdver");
	
		
	
	}

}
