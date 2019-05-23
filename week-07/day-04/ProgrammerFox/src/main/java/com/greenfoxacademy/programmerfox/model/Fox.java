package com.greenfoxacademy.programmerfox.model;

import java.util.List;

public class Fox {
  private String name;
  private List<String> listOfTricks;
  private String food;
  private String drink;
  
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
  
  public String getFood() {
    return food;
  }
  
  public void setFood(String food) {
    this.food = food;
  }
  
  public String getDrink() {
    return drink;
  }
  
  public void setDrink(String drink) {
    this.drink = drink;
  }
}
