package com.greenfoxacademy.todos.service;

import com.greenfoxacademy.todos.model.Todo;
import com.greenfoxacademy.todos.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
  
  private TodoRepository todoRepository;
  
  public TodoService(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }
  
  public List<Todo> findAll() {
    List<Todo> todoList = new ArrayList<>();
    todoRepository.findAll().forEach(todoList::add);
    return todoList;
  }
  
  public Todo findById(long id) {
    return todoRepository.findById(id).orElse(null);
  }
  
  public void save(Todo todo) {
    todoRepository.save(todo);
  }
  
  public void delete(long id) {
    todoRepository.deleteById(id);
  }
  
  public void toggleUrgency(long id) {
    Todo toggleThis = todoRepository.findById(id).orElse(null);
    
    if (toggleThis != null) {
      if (toggleThis.isUrgent()) {
        toggleThis.setUrgent(false);
      } else {
        toggleThis.setUrgent(true);
      }
    }
  }
  
  public void toggleDone(long id) {
    Todo toggleThis = todoRepository.findById(id).orElse(null);
    
    if (toggleThis != null) {
      if (toggleThis.isDone()) {
        toggleThis.setDone(false);
      } else {
        toggleThis.setDone(true);
      }
    }
  }
  
  public List<Todo> findByTitle(String search) {
    List<Todo> filteredList = new ArrayList<>();
    todoRepository.findByTitleContains(search).forEach(filteredList::add);
    return filteredList;
  }
}
