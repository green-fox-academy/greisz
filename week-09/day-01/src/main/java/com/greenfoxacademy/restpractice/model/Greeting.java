package com.greenfoxacademy.restpractice.model;

public class Greeting {
  
  private String welcome_message;
  private String error;
  
  public Greeting() {
  }
  
  public Greeting(String welcome_message) {
    this.welcome_message = welcome_message;
  }
  
  public String getWelcome_message() {
    return welcome_message;
  }
  
  public void setWelcome_message(String welcome_message) {
    this.welcome_message = welcome_message;
  }

}
