package com.greenfoxacademy.restpractice.controller;

import com.greenfoxacademy.restpractice.model.Doubler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
  
  @GetMapping("/")
  public String main() {
    return "index";
  }
}
