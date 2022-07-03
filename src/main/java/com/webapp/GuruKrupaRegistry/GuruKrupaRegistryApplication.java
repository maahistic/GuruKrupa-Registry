package com.webapp.GuruKrupaRegistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class GuruKrupaRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuruKrupaRegistryApplication.class, args);
	}

}
