package com.mou.tcs.OrderPatientPoint.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mou.tcs.OrderPatientPoint.model.FoodMenu;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;




@Service
public class OrderFoodService {

	@Autowired
	private RestTemplate restTemplate;
	
	
	@HystrixCommand(fallbackMethod = "orderFoodFallback1")
	public FoodMenu OrderFood() {
		
		
		FoodMenu foods=restTemplate.getForObject("http://FOODCATALOGMICROSERVICE/getFoodMenu", FoodMenu.class);
				List<String> foodList=(ArrayList)foods.getFoodList();
				
		
		/*
		 * for(String x: foodList) { System.out.println(x); }
		 * 
		 * foodList.stream() .filter(x-> x.startsWith("c"))
		 * 
		 * .forEach(x -> { String menuPrice= x+3 ; System.out.println(menuPrice); });
		 */
		
		//return foods.getFoodList();
				
				return foods;
				
	}
	
	@HystrixCommand(fallbackMethod = "orderAllFoodsFallBack")
	public List<FoodMenu> OrderAllFoods() {			
				String targetUrl="http://FOODCATALOGMICROSERVICE/getFoodMenu";
				ResponseEntity<List<FoodMenu>> actualExample = restTemplate.exchange(targetUrl, HttpMethod.GET, null, new ParameterizedTypeReference<List<FoodMenu>>() {});
				List<FoodMenu> menuList = actualExample.getBody();	
				System.out.println(menuList);
				return menuList;				
	}
	
	
   public List<String> orderFoodFallback() {
		
		return Arrays.asList("No food to order");
		
	}
   
   public List<FoodMenu> orderAllFoodsFallBack() {	
	   return Arrays.asList(new FoodMenu("no food", "no id" , "no price"));
   }
   
   public FoodMenu orderFoodFallback1() {
		
		return new FoodMenu("no food", "no id" , "no price");
		
	}
}
