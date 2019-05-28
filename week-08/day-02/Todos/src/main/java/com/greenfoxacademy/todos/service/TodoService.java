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
    todoRepository.findAll().forEach(todo -> todoList.add(todo));
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
}
