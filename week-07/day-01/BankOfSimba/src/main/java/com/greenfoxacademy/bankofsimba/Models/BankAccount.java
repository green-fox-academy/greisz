package com.greenfoxacademy.bankofsimba.Models;

public class BankAccount {
  private String name;
  private double balance;
  private String animalType;
  private boolean king;
  private boolean goodGuy;
  
  
  public BankAccount() {
  }
  
  public BankAccount(String name, double balance, String animalType, boolean king, boolean goodGuy) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.king = king;
    this.goodGuy = goodGuy;
  }
  
  public String getName() {
    return name;
  }
  
  public double getBalance() {
    return balance;
  }
  
  public String getAnimalType() {
    return animalType;
  }
  
  public boolean isKing() {
    return king;
  }
  
  public boolean isGoodGuy() {
    return goodGuy;
  }
}
