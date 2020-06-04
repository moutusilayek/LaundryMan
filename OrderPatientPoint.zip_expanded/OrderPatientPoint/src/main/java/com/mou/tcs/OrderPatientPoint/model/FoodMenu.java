package com.mou.tcs.OrderPatientPoint.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Component;



@Component


public class FoodMenu {
	

  private String foodType; 
 

  private String price;
 

  private String foodId;
 

  private String foodMenu;
 

  private  List<String> foodList;
  
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

public List<String> getFoodList() {
	return foodList;
}

public void setFoodList(List<String> foodList) {
	this.foodList = foodList;
}
  
  
}

