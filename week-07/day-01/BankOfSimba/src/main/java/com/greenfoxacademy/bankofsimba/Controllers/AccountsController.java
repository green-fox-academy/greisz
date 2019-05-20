package com.greenfoxacademy.bankofsimba.Controllers;

import com.greenfoxacademy.bankofsimba.Models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AccountsController {
  private List<BankAccount> accountsList;
  
  @ModelAttribute
  public void setup(Model model) {
    accountsList = new ArrayList<>();
    accountsList.add(new BankAccount("Simba", 1000, "lion", true, true));
    accountsList.add(new BankAccount("Timon", 800, "suricate", false, true));
    accountsList.add(new BankAccount("Pumbaa", 900, "warthog", false, true));
    accountsList.add(new BankAccount("Scar", 1000, "lion", false, false));
    accountsList.add(new BankAccount("Mufasa", 1000, "lion", true, true));
  
  }
  @RequestMapping(path = "/show", method = RequestMethod.GET)
  public String showAccounts(Model model) {
    model.addAttribute("accounts", accountsList);
    return "accounts";
  }
  
  @RequestMapping(path = "/showTable", method = RequestMethod.GET)
  public String showAccountsInTable(Model model) {
    model.addAttribute("accounts", accountsList);
    return "accounts_table";
  }
}
