package com.greenfoxacademy.springstart.controller;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
  private AtomicLong id = new AtomicLong();
  private String content;
  
  public Greeting(String content) {
    this.content = content;
  }
  
  public Greeting() {
  }
  
  public AtomicLong getId() {
    return id;
  }
  
  public String getContent() {
    return content;
  }
  
  public void setContent(String content) {
    this.content = content;
  }
}
