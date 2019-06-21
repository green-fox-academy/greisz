package com.greenfoxacademy.todos.controller;

import com.greenfoxacademy.todos.model.Todo;
import com.greenfoxacademy.todos.service.AssigneeService;
import com.greenfoxacademy.todos.service.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class TodoController {
  
  private TodoService todoService;
  private AssigneeService assigneeService;
  
  
  public TodoController(TodoService todoService, AssigneeService assigneeService) {
    this.todoService = todoService;
    this.assigneeService = assigneeService;
  }
  
  @GetMapping({"/", "/todo"})
  public String list(Model model) {
//    if (model.containsAttribute("todos")) {
    model.addAttribute("todos", todoService.findAll());
//    } else {
//      model.addAttribute("todos", filteredTodos);
//    }
    return "todoList";
  }

  @PostMapping("/todo")
  public String searchByTitle(Model model, String search) {
    model.addAttribute("todos", todoService.findByTitle(search));
    return "todoList";
  }

//  @PostMapping("/todo/search")
//  public ModelAndView searchByTitle(ModelMap model, String search) {
//    model.addAttribute("todos", todoService.findByTitle(search));
//    return new ModelAndView("redirect:/", model);
//  }
  
//  @PostMapping("/todo")
//  public String searchByTitle(RedirectAttributes attributes, String search) {
//    attributes.addFlashAttribute("todos", todoService.findByTitle(search));
//    return "redirect:/";
//  }
  
  @GetMapping("/todo/add")
  public String renderAddTodoPage(Model model) {
    model.addAttribute("todo", new Todo());
    model.addAttribute("assignees", assigneeService.findAll());
    return "addTodo";
  }
  
  @PostMapping("/todo/add")
  public String addTodo(Todo todo) {
    todoService.save(todo);
    return "redirect:/todo";
  }
  
  @GetMapping("/todo/{id}/delete")
  public String deleteTodo(@PathVariable(value = "id") long id) {
    todoService.delete(id);
    return "redirect:/todo";
  }
  
  @GetMapping("/todo/{id}/toggleUrgency")
  public String toggleTodoUrgency(@PathVariable(value = "id") long id) {
    todoService.toggleUrgency(id);
    todoService.save(todoService.findById(id));
    return "redirect:/todo";
  }
  
  @GetMapping("/todo/{id}/toggleDone")
  public String toggleTodoDone(@PathVariable(value = "id") long id) {
    todoService.toggleDone(id);
    todoService.save(todoService.findById(id));
    return "redirect:/todo";
  }
}
