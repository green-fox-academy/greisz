package com.greenfoxacademy.restpractice.model;

public class Doubler {
  
  private Integer received;
  private Integer result;
  private String error;
  
  
  public Doubler() {
  }
  
  public Doubler(int received) {
    this.received = received;
    this.result = received * 2;
  }
  
  public Integer getReceived() {
    return received;
  }
  
  public void setReceived(Integer received) {
    this.received = received;
  }
  
  public Integer getResult() {
    return result;
  }
  
  public void setResult(Integer result) {
    this.result = result;
  }
}
