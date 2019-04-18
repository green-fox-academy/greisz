import java.util.Collections;
import java.util.List;

public class Farm {
  private int capacity;
  private List<Animal> herd;
  
  public void breed() {
    if (this.herd.size() < capacity) {
      this.herd.add(new Animal());
      System.out.println("New animal bred, now you have " + this.herd.size());
    } else {
      System.out.println("No room fore more animals!");
    }
  }
  
  public void slaughter(Animal animal) {
    int minHunger = 1000;
    for (int i = 0; i < this.herd.size(); i++) {
      if (this.herd.get(i).getHunger() < minHunger){
        minHunger = this.herd.get(i).getHunger();
      }
      this.herd.remove(this.herd.indexOf(minHunger));
    }
    
  }
}