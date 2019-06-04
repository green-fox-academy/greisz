package com.greenfoxacademy.resttesting.model;

public class ErrorMessage {
  
  private String error;
  
  public ErrorMessage() {
  }
  
  public ErrorMessage(String error) {
    this.error = error;
  }
  
  public String getError() {
    return error;
  }
  
  public void setError(String error) {
    this.error = error;
  }
}