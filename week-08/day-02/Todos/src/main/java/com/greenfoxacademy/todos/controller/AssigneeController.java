package com.greenfoxacademy.todos.controller;

import com.greenfoxacademy.todos.model.Assignee;
import com.greenfoxacademy.todos.service.AssigneeService;
import com.greenfoxacademy.todos.service.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AssigneeController {
  
  private TodoService todoService;
  private AssigneeService assigneeService;
  
  public AssigneeController(TodoService todoService, AssigneeService assigneeService) {
    this.todoService = todoService;
    this.assigneeService = assigneeService;
  }
  
  @GetMapping("/assignees")
  public String assigneeList(Model model) {
    model.addAttribute("assignees", assigneeService.findAll());
    return "assigneeList";
  }
  
  @GetMapping("/assignees/add")
  public String renderAddAssigneePage(Model model) {
    model.addAttribute("assignee", new Assignee());
    return "addAssignee";
  }
  
  @PostMapping("/assignee/add")
  public String addAssignee(Assignee assignee) {
    assigneeService.save(assignee);
    return "redirect:/assignees";
  }
}
