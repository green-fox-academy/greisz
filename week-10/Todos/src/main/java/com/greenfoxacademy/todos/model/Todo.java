package com.greenfoxacademy.todos.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
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
    this.urgent = false;
    this.done = false;
  }
  
  public Todo(String title) {
    this.title = title;
    this.urgent = false;
    this.done = false;
  }
  
  public long getId() {
    return id;
  }
  
  public void setId(long id) {
    this.id = id;
  }
  
  public String getTitle() {
    return title;
  }
  
  public void setTitle(String title) {
    this.title = title;
  }
  
  public Assignee getAssignee() {
    return assignee;
  }
  
  public void setAssignee(Assignee assignee) {
    this.assignee = assignee;
  }
  
  public boolean isUrgent() {
    return urgent;
  }
  
  public void setUrgent(boolean urgent) {
    this.urgent = urgent;
  }
  
  public boolean isDone() {
    return done;
  }
  
  public void setDone(boolean done) {
    this.done = done;
  }
}
