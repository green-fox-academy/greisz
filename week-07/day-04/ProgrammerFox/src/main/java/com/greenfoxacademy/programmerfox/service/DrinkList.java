package com.greenfoxacademy.programmerfox.service;

import com.greenfoxacademy.programmerfox.model.Drink;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class DrinkList {
  private List<Drink> drinkList;
  
  public DrinkList() {
    this.drinkList = new ArrayList<>();
    this.drinkList.add(new Drink("water"));
    this.drinkList.add(new Drink("beer"));
    this.drinkList.add(new Drink("Vodka+RedBull"));
    this.drinkList.add(new Drink("coffee"));
    }
  
  public List<Drink> getDrinkList() {
    return drinkList;
  }
  
  public void setDrinkList(List<Drink> drinkList) {
    this.drinkList = drinkList;
  }
}
