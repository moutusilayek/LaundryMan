package com.mou.tcs.microserviceFood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroserviceFoodApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceFoodApplication.class, args);
	}

}
