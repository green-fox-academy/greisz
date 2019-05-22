package com.example.dependencyinjections.controller;

import com.example.dependencyinjections.service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UsefulPageController {
  private UtilityService utilityService;
  
  public UsefulPageController(UtilityService utilityService) {
    this.utilityService = utilityService;
  }
  
  @RequestMapping(path = "/useful", method = RequestMethod.GET)
  public String useful() {
    return "useful";
  }
  
  @RequestMapping(path = "/useful/color", method = RequestMethod.GET)
  public String color(Model model) {
    model.addAttribute("color", this.utilityService.randomColor());
    return "color";
  }
}
