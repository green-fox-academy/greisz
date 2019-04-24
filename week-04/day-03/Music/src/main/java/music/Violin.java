package main.java.music;

public class Violin extends StringedInstrument {
  private final String makeSound = "Screech";
  
  public Violin() {
    this.setNumberOfStrings(4);
  }
  
  @Override
  public void sound() {
    System.out.println(makeSound);
  }
}
