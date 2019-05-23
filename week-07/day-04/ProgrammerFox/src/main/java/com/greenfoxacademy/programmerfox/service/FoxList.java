package com.greenfoxacademy.programmerfox.service;

import com.greenfoxacademy.programmerfox.model.Fox;
import org.springframework.stereotype.Service;

import javax.validation.constraints.Null;
import java.util.ArrayList;
import java.util.List;

@Service
public class FoxList {
  private List<Fox> foxList = new ArrayList<>();
  
  public void addFox(String name) {
    this.foxList.add(new Fox(name));
  }
}
