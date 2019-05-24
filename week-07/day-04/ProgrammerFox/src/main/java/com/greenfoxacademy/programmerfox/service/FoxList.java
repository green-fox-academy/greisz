package com.greenfoxacademy.programmerfox.service;

import com.greenfoxacademy.programmerfox.model.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoxList {
  List<Fox> foxList;
  
  public FoxList() {
    this.foxList = new ArrayList<>();
  }
  
  
  public List<Fox> getFoxList() {
    return foxList;
  }
  
  public void addFox(String name) {
    this.foxList.add(new Fox(name));
  }
  
  public boolean nameCheck(String name) {
    return this.foxList.stream().noneMatch(f -> f.getName().equals(name));
  }
}
