package com.greenfoxacademy.webshop.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class WebshopController {
  List<ShopItem> shopItemsList;
  
  public WebshopController() {
    this.shopItemsList = new ArrayList<>();
    this.shopItemsList.add(new ShopItem("Jam72", "India pale ale", 1000, 4));
    this.shopItemsList.add(new ShopItem("Mango bay", "Mango milkshake pale ale", 900, 10));
    this.shopItemsList.add(new ShopItem("Smooth hoperator", "New England IPA", 1050, 8));
    this.shopItemsList.add(new ShopItem("Tokyo lemonade", "Yuzu witbier", 820, 2));
    this.shopItemsList.add(new ShopItem("Duplicator", "Dunkel doppelbock", 900l, 4));
  
  }
  
  @RequestMapping("/")
  public String greeting(Model model) {
    model.addAttribute("items", this.shopItemsList);
    return "index";
  }
  
  
}
