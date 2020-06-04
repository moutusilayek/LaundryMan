package com.tcs.mou.SpringAPIGatewayNew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class SpringApiGatewayNewApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringApiGatewayNewApplication.class, args);
	}

}
