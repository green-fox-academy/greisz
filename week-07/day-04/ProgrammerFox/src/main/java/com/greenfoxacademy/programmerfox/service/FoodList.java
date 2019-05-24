package com.greenfoxacademy.programmerfox.service;

import com.greenfoxacademy.programmerfox.model.Food;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoodList {
  private List<Food> foodList;
  
  public FoodList() {
    this.foodList = new ArrayList<>();
    this.foodList.add(new Food("pizza"));
    this.foodList.add(new Food("steak"));
    this.foodList.add(new Food("salad"));
    this.foodList.add(new Food("chocolate cake"));
  }
  
  public List<Food> getFoodList() {
    return foodList;
  }
  
  public void setFoodList(List<Food> foodList) {
    this.foodList = foodList;
  }
}
