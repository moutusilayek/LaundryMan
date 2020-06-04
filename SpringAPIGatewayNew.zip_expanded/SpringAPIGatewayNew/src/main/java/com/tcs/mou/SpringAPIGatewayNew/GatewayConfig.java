package com.tcs.mou.SpringAPIGatewayNew;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {
	
	
	@Bean
	@LoadBalanced
	public RouteLocator myRoutes(RouteLocatorBuilder builder) {
		return builder.routes()
				
				
				.route(p -> p
			            .path("/get")
			            .filters(f -> f.addRequestHeader("Hello", "World"))
			            .uri("http://httpbin.org:80"))
				.route(p -> p
						.path("/getFoodMenu")
						.uri("http://localhost:8082/getFoodMenu"))
				         
				
				.build();

    }
	
	
	
	
	
}
	
