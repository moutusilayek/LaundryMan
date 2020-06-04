package com.mou.tcs.microserviceFood;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mou.tcs.microserviceFood.model.FoodMenu;


@RestController
public class FoodCatalog {
	
	@Autowired
	private FoodMenu foodMenu;
	
	@Autowired
	private FoodRepository repo;
	
	/*
	 * @RequestMapping("/getFoodCatalog") 
	 * public FoodMenu getFoodCatalog() {
	 * foodMenu.setFoodList(Arrays.asList( "Biriyani", "egg" , "chicken"));
	 * foodMenu.setPrice("1000"); foodMenu.setFoodId("10"); return foodMenu; }
	 */
	
	
	
	@RequestMapping(method=RequestMethod.POST , value="/addFoodMenu")
	public void addFoodMenu(@RequestBody FoodMenu food) {
		repo.save(food);
	
	}
	
	
	@RequestMapping(method=RequestMethod.PUT , value="/updateFoodMenu")
	public void updateFoodMenu(@RequestBody FoodMenu food) {
		repo.save(food);
	}
	
	@RequestMapping(method=RequestMethod.DELETE , value="/deleteFoodMenu")
	public void deleteFoodMenu(@RequestBody FoodMenu food) {
		repo.delete(food);
	}
	
	@RequestMapping(method=RequestMethod.GET , value="/getFoodMenu")
	public List<FoodMenu> getFoodMenu() {
		return (List<FoodMenu>) repo.findAll();
	}
	
	@RequestMapping(method=RequestMethod.GET , value="/getFoodMenuById/{id}")
	public Optional<FoodMenu> getFoodMenuById(@PathVariable String id) {
		return repo.findById(id);
	}
	
	
	

}
