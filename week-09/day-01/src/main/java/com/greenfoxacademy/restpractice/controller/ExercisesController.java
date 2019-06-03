package com.greenfoxacademy.restpractice.controller;

import com.greenfoxacademy.restpractice.model.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class ExercisesController {
  
  @GetMapping("/doubling")
  public Object doubling(@RequestParam(required = false) Integer input) {
    
    if (input == null) {
      return new ErrorMessage("Please provide an input!");
    } else {
      return new Doubler(input);
    }
  }
  
  @GetMapping("/greeter")
  public Object greeting(@RequestParam(required = false) String name, String title) {
    
    if (name == null && title == null) {
      return new ErrorMessage("Please provide a name and a title!");
    } else {
      return new Greeting("Oh, hi there " + name + ", my dear " + title + "!");
    }
  }
  
  @GetMapping("/appenda/{appendable}")
  public Object appendA(@PathVariable(required = false) String appendable) {
    return new AppendA(appendable);
  }
  
  @PostMapping("/dountil/{action}")
  private Object doUntil(
          @PathVariable(required = false) String action,
          @RequestBody UntilThisNumber untilThisNumber) {
    
    int result = 0;
    
    switch (action) {
      case "sum":
        for (int i = 1; i <= untilThisNumber.getUntil(); i++) {
          result += i;
        }
        return new ReturnNumber(result);
      
      case "factor":
        result = 1;
        for (int i = 2; i <= untilThisNumber.getUntil(); i++) {
          result = result * i;
        }
        return new ReturnNumber(result);
      
      default:
        return new ErrorMessage("Some error");
    }
  }
}