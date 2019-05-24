package com.greenfoxacademy.programmerfox.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoxController {
  
  @RequestMapping(path = "/info", method = RequestMethod.GET)
  public String index(Model model, @RequestParam(required = true) String name) {
    model.addAttribute("name", name);
    return "foxInfo";
  }
}
