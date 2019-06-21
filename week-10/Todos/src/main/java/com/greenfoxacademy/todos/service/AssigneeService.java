package com.greenfoxacademy.todos.service;

import com.greenfoxacademy.todos.model.Assignee;
import com.greenfoxacademy.todos.repository.AssigneeRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AssigneeService {
  
  private AssigneeRepository assigneeRepository;
  
  public AssigneeService(AssigneeRepository assigneeRepository) {
    this.assigneeRepository = assigneeRepository;
  }
  
  public List<Assignee> findAll() {
    List<Assignee> assigneeList = new ArrayList<>();
    assigneeRepository.findAll().forEach(assigneeList::add);
    return assigneeList;
  }
  
  public Assignee findById(Long id) {
    return assigneeRepository.findById(id).orElse(null);
  }
  
  public void save(Assignee assignee) {
    assigneeRepository.save(assignee);
  }
  
  public void delete(Long id) {
    assigneeRepository.deleteById(id);
  }
}
