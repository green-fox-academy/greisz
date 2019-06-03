package com.greenfoxacademy.todos.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Todo {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String title;
  @ManyToOne
  private Assignee assignee;
  private boolean urgent;
  private boolean done;
  
  public Todo() {
    this.urgent =false;
    this.done = false;
  }
  
  public Todo(String title) {
    this.title = title;
    this.urgent = false;
    this.done = false;
  }
}
