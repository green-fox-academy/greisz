package com.example.dependencyinjections.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("BlueColor")
public class BlueColor implements MyColor {
  private String color;
  
  public BlueColor() {
    this.color = "blue";
  }
  
  @Override
  public String printColor() {
    return "It is " + this.color + " in color...";
  }
}