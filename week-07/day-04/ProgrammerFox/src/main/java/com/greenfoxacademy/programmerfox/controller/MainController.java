package com.greenfoxacademy.programmerfox.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
  
  @RequestMapping(path = "/", method = RequestMethod.GET)
  public String index(Model model, @RequestParam(required = false) String name) {
    model.addAttribute("name", name);
    return "index";
  }
}
