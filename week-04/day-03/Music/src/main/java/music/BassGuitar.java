package main.java.music;

public class BassGuitar extends StringedInstrument {
  private final String makeSound = "Duum-duum-duum";
  
  public BassGuitar() {
    this.setNumberOfStrings(4);
    this.name = "Bass Guitar";
  }
  
  public BassGuitar(int strings) {
    this.setNumberOfStrings(strings);
    this.name = "Bass Guitar";
  }
  
  @Override
  public void sound() {
    System.out.println(makeSound);
  }
}
