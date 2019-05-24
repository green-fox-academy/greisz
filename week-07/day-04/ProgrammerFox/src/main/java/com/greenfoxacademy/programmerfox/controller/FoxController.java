package com.greenfoxacademy.programmerfox.controller;

import com.greenfoxacademy.programmerfox.service.FoxList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoxController {
  
  @Autowired
  FoxList foxList;
  
  @RequestMapping(path = "/info", method = RequestMethod.GET)
  public String index(Model model, @RequestParam(required = true) int index) {
    model.addAttribute("index", index);
    model.addAttribute("name", foxList.getFoxList().get(index).getName());
    return "foxInfo";
  }
}
