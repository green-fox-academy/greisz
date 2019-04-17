public class Animal {
  int hunger;
  int thirst;
  
  public static void main(String[] args) {
    Animal firstAnimal = new Animal();
  }
  
  public Animal() {
    this.hunger = 50;
    this.thirst = 50;
  }
  
  public void eat() {
    this.hunger--;
  }
  
  public void drink() {
    this.thirst--;
  }
  
  public void play() {
    this.hunger++;
    this.thirst++;
  }
}
