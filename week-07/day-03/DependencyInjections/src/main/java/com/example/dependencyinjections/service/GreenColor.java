package com.example.dependencyinjections.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("GreenColor")
public class GreenColor implements MyColor {
  private String color;
  
  public GreenColor() {
    this.color = "green";
  }
  
  @Override
  public String printColor() {
    return "It is " + this.color + " in color...";
  }
}