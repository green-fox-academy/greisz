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
    hunger--;
  }
  
  public void drink() {
    thirst--;
  }
  
  public void play() {
    hunger++;
    thirst++;
  }
}
