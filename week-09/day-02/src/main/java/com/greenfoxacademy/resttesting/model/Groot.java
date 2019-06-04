package com.greenfoxacademy.resttesting.model;

public class Groot {
  
  private String recieved;
  private String translated;
  
  public Groot() {
  }
  
  public Groot(String recieved) {
    this.recieved = recieved;
    this.translated = "I am Groot";
  }
  
  public String getRecieved() {
    return recieved;
  }
  
  public void setRecieved(String recieved) {
    this.recieved = recieved;
  }
  
  public String getTranslated() {
    return translated;
  }
  
  public void setTranslated(String translated) {
    this.translated = translated;
  }
}
