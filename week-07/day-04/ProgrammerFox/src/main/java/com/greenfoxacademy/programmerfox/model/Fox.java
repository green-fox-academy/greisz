package com.greenfoxacademy.programmerfox.model;

import java.util.List;

public class Fox {
  private String name;
  private List<String> listOfTricks;
  private Food food;
  private Drink drink;
  
  public Fox(String name) {
    this.name = name;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public List<String> getListOfTricks() {
    return listOfTricks;
  }
  
  public void setListOfTricks(List<String> listOfTricks) {
    this.listOfTricks = listOfTricks;
  }
  
  public Food getFood() {
    return food;
  }
  
  public void setFood(Food food) {
    this.food = food;
  }
  
  public Drink getDrink() {
    return drink;
  }
  
  public void setDrink(Drink drink) {
    this.drink = drink;
  }
}
