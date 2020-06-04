package com.mou.tcs.OrderPatientPoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.mou.tcs.OrderPatientPoint.model.FoodMenu;
import com.mou.tcs.OrderPatientPoint.service.OrderFoodService;

@RestController
public class OrderFood {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	OrderFoodService foodService;
	
	@RequestMapping(value="/orderFood" , method=RequestMethod.GET , produces= MediaType.APPLICATION_XML_VALUE)
	@ResponseBody
	public FoodMenu OrderFoodMenu() {
			
		return foodService.OrderFood(); 		
				
	}
	
	
	@RequestMapping(value="/getAllFoodMenu" , method=RequestMethod.GET )
	@ResponseBody
	public List<FoodMenu> getAllFoodMenu() {
			
		return foodService.OrderAllFoods(); 		
				
	}
	
	
	
	

}
