package com.example.dependencyinjections.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("RedColor")
public class RedColor implements MyColor {
  private String color;
  
  public RedColor() {
    this.color = "red";
  }
  
  @Override
  public String printColor() {
    return "It is " + this.color + " in color...";
  }
}