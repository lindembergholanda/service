package com.example.serviceauthserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceAuthServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceAuthServerApplication.class, args);
	}

}
