package com.greenfoxacademy.programmerfox.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
  
  @RequestMapping(path = "/", method = RequestMethod.GET)
  public String index() {
    return "index";
  }
  
  @RequestMapping(path = "/login", method = RequestMethod.GET)
  public String loginForm() {
    return "login";
  }
  
  @RequestMapping(path = "/login", method = RequestMethod.POST)
  public String login() {
    return "login";
  }
}
