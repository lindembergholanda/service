package com.example.serviceevent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceEventApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceEventApplication.class, args);
	}
}
