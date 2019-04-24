package main.java.music;

public class BassGuitar extends StringedInstrument {
  private final String makeSound = "Duum-duum-duum";
  
  public BassGuitar() {
    this.setNumberOfStrings(4);
  }
  
  @Override
  public void sound() {
    System.out.println(makeSound);
  }
}
