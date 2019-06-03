package com.greenfoxacademy.restpractice.model;

public class ErrorMessage {
  
  private String error;
  
  public ErrorMessage() {
  }
  
  public ErrorMessage(String error) {
    this.error = error;
  }
  
  public String getErrorMessage() {
    return error;
  }
  
  public void setErrorMessage(String error) {
    this.error = error;
  }
}
