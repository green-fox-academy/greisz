package com.greenfoxacademy.programmerfox.controller;

import com.greenfoxacademy.programmerfox.service.FoxList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegistrationController {
  
  @Autowired
  FoxList foxList;
  
  @RequestMapping(path = "/registration", method = RequestMethod.GET)
  
  public String registrationForm(Model model) {
    model.addAttribute("text", "Please provide a name, so you can associate it to your pet!");
    return "registration";
  }
  
  @RequestMapping(path = "/registration", method = RequestMethod.POST)
  public String addFox(String name, Model model) {
    if (foxList.nameCheck(name)) {
      foxList.addFox(name);
      return "redirect:/info?name=" + name;
    }
    model.addAttribute("text", "Name \"" + name + "\" is taken, please give your fox an other name!");
    model.addAttribute("color", "red");
    return "registration";
  }
}
