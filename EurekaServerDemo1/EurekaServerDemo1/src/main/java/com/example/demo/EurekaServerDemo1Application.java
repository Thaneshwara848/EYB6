package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerDemo1Application.class, args);
		System.out.println("Eureka Server is Working ");
		// run the eureka server with this port http://localhost:8761
	}

}
