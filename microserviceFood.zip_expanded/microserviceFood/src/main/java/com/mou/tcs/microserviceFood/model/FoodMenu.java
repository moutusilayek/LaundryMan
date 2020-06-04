package com.mou.tcs.microserviceFood.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;



@Component
@Entity
public class FoodMenu {
	
 @Id
  private String foodId;
  private String foodType;  
  private String price;
  private String foodMenu;
	/* private List<FoodMenu> foodList; */
  
  public FoodMenu() {
	  
  }
  
  public FoodMenu(String foodMenu, String foodId, String price) {
	  this.foodMenu=foodMenu;
	  this.foodId=foodId;
	  this.price=price;
	}

public String getFoodType() {
	return foodType;
}

public void setFoodType(String foodType) {
	this.foodType = foodType;
}

public String getPrice() {
	return price;
}

public void setPrice(String price) {
	this.price = price;
}

public String getFoodId() {
	return foodId;
}

public void setFoodId(String foodId) {
	this.foodId = foodId;
}

public String getFoodMenu() {
	return foodMenu;
}

public void setFoodMenu(String foodMenu) {
	this.foodMenu = foodMenu;
}

	/*
	 * public List getFoodList() { return foodList; }
	 * 
	 * public void setFoodList(List foodList) { this.foodList = foodList; }
	 */
  
}

