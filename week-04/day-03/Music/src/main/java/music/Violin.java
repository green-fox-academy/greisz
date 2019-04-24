package main.java.music;

public class Violin extends StringedInstrument {
  private final String makeSound = "Screech";
  
  public Violin() {
    this.setNumberOfStrings(4);
    this.name = "Violin";
  }
  
  public Violin(int strings) {
    this.setNumberOfStrings(strings);
  }
  
  @Override
  public void sound() {
    System.out.println(makeSound);
  }
}
