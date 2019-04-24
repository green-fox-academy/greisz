package main.java.music;

public abstract class StringedInstrument extends Instrument {
  private int NumberOfStrings;
  
  public int getNumberOfStrings() {
    return NumberOfStrings;
  }
  
  public void setNumberOfStrings(int numberOfStrings) {
    NumberOfStrings = numberOfStrings;
  }
  
  public abstract void sound();
  
  @Override
  public void play() {
    this.sound();
  }
}
