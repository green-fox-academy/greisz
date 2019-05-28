package com.greenfoxacademy.todos.controller;

import com.greenfoxacademy.todos.service.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoController {
  
  private TodoService todoService;
  
  public TodoController(TodoService todoService) {
    this.todoService = todoService;
  }
  
  @GetMapping("/todo")
  public String list(Model model) {
    model.addAttribute("todos", todoService.findAll());
    return "todolist";
  }
}
