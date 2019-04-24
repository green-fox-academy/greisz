package main.java.music;

public class ElectricGuitar extends StringedInstrument {
  private final String makeSound = "Twang";
  
  public ElectricGuitar() {
    this.setNumberOfStrings(6);
  }
  
  @Override
  public void sound() {
    System.out.println(makeSound);
  }
}
