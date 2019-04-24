package main.java.animals;

public class Bird extends Animal implements Flyable {
  public Bird(String name) {
    super(name);
  }
  
  @Override
  public String breed() {
    return "laying eggs";
  }
  
  @Override
  public void land() {
    System.out.println("Bird lands");
  }
  
  @Override
  public void fly() {
    System.out.println("Bird flies");
  }
  
  @Override
  public void takeOff() {
    System.out.println("Bird takes off");
  }
}
