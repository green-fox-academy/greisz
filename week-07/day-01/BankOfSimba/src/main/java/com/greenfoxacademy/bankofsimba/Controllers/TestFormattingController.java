package com.greenfoxacademy.bankofsimba.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestFormattingController {
  
  @RequestMapping(path = "/testFormatting", method = RequestMethod.GET)
  public String text(Model model) {
    model.addAttribute("text", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "testFormatting";
  }
}
