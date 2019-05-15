package com.greenfoxacademy.springstart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloNameWebController {
  Greeting greeting = new Greeting();
  
  @RequestMapping("/web/greeting/name")
  public String greeting(@RequestParam(required = true) String name, Model model) {
    greeting.setContent(name);
    model.addAttribute("name", greeting.getContent());
    model.addAttribute("id", greeting.getId());
    greeting.getId().incrementAndGet();
    return "greeting_name_count";
  }
}
