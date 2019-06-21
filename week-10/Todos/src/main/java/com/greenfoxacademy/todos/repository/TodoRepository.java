package com.greenfoxacademy.todos.repository;

import com.greenfoxacademy.todos.model.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoRepository extends CrudRepository<Todo, Long> {
  public List<Todo> findByTitleContains(String search);
}
