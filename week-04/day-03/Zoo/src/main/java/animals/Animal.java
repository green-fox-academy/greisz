package main.java.animals;

public abstract class Animal {
  private String name;
  private int age;
  private String gender;
  
  public String getName() {
    return name;
  }
  
  public abstract void breed();
}
