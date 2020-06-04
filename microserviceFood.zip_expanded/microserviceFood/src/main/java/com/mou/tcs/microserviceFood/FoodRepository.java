package com.mou.tcs.microserviceFood;

import org.springframework.data.repository.CrudRepository;

import com.mou.tcs.microserviceFood.model.FoodMenu;

public interface FoodRepository extends CrudRepository<FoodMenu, String>{

}
