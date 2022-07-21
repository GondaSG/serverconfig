package com.bootcamp.serviceconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ServiceconfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceconfigApplication.class, args);
	}

}
