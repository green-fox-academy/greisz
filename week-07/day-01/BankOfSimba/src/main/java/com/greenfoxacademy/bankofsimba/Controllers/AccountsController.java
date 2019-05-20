package com.greenfoxacademy.bankofsimba.Controllers;

import com.greenfoxacademy.bankofsimba.Models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AccountsController {
  private List<BankAccount> accountsList = new ArrayList<>();
  
  
  @RequestMapping(path = "/show", method = RequestMethod.GET)
  public String showAccounts(Model model) {
    accountsList.add(new BankAccount("Simba", 1000, "lion"));
    accountsList.add(new BankAccount("Timon", 800, "suricate"));
    accountsList.add(new BankAccount("Pumbaa", 900, "warthog"));
    
    model.addAttribute("accounts", accountsList);
    return "accounts";
  }
}
