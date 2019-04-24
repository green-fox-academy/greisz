package main.java.music;

public class ElectricGuitar extends StringedInstrument {
  private final String makeSound = "Twang";
  
  public ElectricGuitar() {
    this.setNumberOfStrings(6);
    this.name = "Electric Guiar";
  }
  
  public ElectricGuitar(int strings) {
    this.setNumberOfStrings(strings);
  }
  
  @Override
  public void sound() {
    System.out.println(makeSound);
  }
}
