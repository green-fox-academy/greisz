package com.greenfoxacademy.springstart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MultilanguageHelloWebController {
  private final String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
          "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
          "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
          "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};
  
  @RequestMapping("/web/greeting/multilanguage")
  public String greeting(Model model) {
    int randomLanguage = (int) (Math.random() * this.hellos.length);
    String hello = this.hellos[randomLanguage];
    
    int randomRed = (int) (Math.random() * 256);
    int randomGreen = (int) (Math.random() * 256);
    int randomBlue = (int) (Math.random() * 256);
    int randomsize = (int) (Math.random() * 60 + 20);
    
    model.addAttribute("greet", hello);
    model.addAttribute("red", randomRed);
    model.addAttribute("green", randomGreen);
    model.addAttribute("blue", randomBlue);
    model.addAttribute("size", randomsize);
  
    return "greeting_multilanguage";
  }
}
