package com.greenfoxacademy.restpractice.controller;

import com.greenfoxacademy.restpractice.model.Doubler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExercisesController {
  
  @GetMapping("/doubling")
  public Doubler doubling(@RequestParam int input) {
    Doubler doubler = new Doubler(input);
    return doubler;
  }
}