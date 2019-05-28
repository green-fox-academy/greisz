package com.greenfoxacademy.todos.controller;

import com.greenfoxacademy.todos.model.Todo;
import com.greenfoxacademy.todos.service.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
  
  @GetMapping("/addTodo")
  public String renderAddTodoPage(Model model) {
    model.addAttribute("todo", new Todo());
    return "addTodo";
  }
  
  @PostMapping("/addTodo")
  public String addTodo(Todo todo) {
    todoService.save(todo);
    return "redirect:/todo";
  }
}
