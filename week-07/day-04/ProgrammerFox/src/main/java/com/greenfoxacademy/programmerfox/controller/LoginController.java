package com.greenfoxacademy.programmerfox.controller;

import com.greenfoxacademy.programmerfox.service.FoxList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
  
  @Autowired
  FoxList foxList;
  
  @RequestMapping(path = "/login", method = RequestMethod.GET)
  public String loginPage(Model model) {
    model.addAttribute("foxList", foxList.getFoxList());
    return "login";
  }
  
  @RequestMapping(path = "/login", method = RequestMethod.POST)
  public String selectFox(int index) {
    return "redirect:/info?index=" + index;
  }
}

