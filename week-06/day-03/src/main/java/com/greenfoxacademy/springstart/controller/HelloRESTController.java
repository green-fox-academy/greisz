package com.greenfoxacademy.springstart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {
  Greeting greeting = new Greeting();
  
  @RequestMapping("/greeting")
  public Greeting greeting(@RequestParam(required = true) String name) {
    greeting.setContent("Hello " + name);
    greeting.getId().incrementAndGet();
    return greeting;
  }
}
