package com.greenfoxacademy.resttesting.controller;

import com.greenfoxacademy.resttesting.model.ErrorMessage;
import com.greenfoxacademy.resttesting.model.Groot;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {
  
  @GetMapping("/groot")
  public ResponseEntity<Object> groot(@RequestParam(required = false) String message) {
    if (message == null) {
      return ResponseEntity.badRequest().body(new ErrorMessage("I am Groot"));
//      return ResponseEntity.badRequest().body(new ErrorMessage("I am Groot"));
    } else {
      return ResponseEntity.ok(new Groot(message));
    }
  }
}
