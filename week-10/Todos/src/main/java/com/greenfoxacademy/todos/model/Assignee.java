package com.greenfoxacademy.todos.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Assignee {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String name;
  private String email;
  @OneToMany
  private List<Todo> todoList;
  
  public Assignee() {
  }
}
