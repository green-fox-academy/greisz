package com.greenfoxacademy.programmerfox.controller;

import com.greenfoxacademy.programmerfox.service.DrinkList;
import com.greenfoxacademy.programmerfox.service.FoodList;
import com.greenfoxacademy.programmerfox.service.FoxList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NutritionController {
  
  @Autowired
  FoxList foxList;
  @Autowired
  FoodList foodList;
  @Autowired
  DrinkList drinkList;
  
  
  
  @RequestMapping(path = "/nutritionStore", method = RequestMethod.GET)
  public String nutrition(Model model, @RequestParam(required = true) int index) {
    model.addAttribute("foodList", foodList.getFoodList());
    model.addAttribute("drinkList", drinkList.getDrinkList());
    model.addAttribute("fox", foxList.getFoxList().get(index));
    return "nutrition";
  }
  
  @RequestMapping(path = "/nutritionStore", method = RequestMethod.POST)
  public String feedFox(String name, String food, String drink) {
    foxList.getFoxList();
    return "redirect:/info" + name;
  }
}
