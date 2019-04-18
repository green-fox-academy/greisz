import java.util.ArrayList;
import java.util.List;

public class Ship {
  String name;
  List<Pirate> crew = new ArrayList<>();
  Pirate captain = new Pirate();
  
  public Ship(String name) {
    this.name = name;
  }
  
  public void getInfo() {
    System.out.println("Ship name: " + this.name);
    this.captainInfo();
    this.crewInfo();
  }
  
  public int captainInfo() {
    if (this.captain != null) {
      System.out.println("Captain's name: " + this.captain.getName());
      System.out.println("The captain has drunk " + this.captain.getDrunkLevel() + " bottles ot rum.");
      return this.captain.getDrunkLevel();
    } else {
      System.out.println(this + " has no captain, hire somebody!");
      return 0;
    }
  }
  
  public int crewInfo() {
    if (this.crew != null) {
      int crewAlive = 0;
      for (int i = 0; i < this.crew.size(); i++) {
        if (this.crew.get(i).isAlive() == true) {
          crewAlive++;
        }
      }
      System.out.println("Number of alive crew members: " + crewAlive);
      return crewAlive;
    } else {
      System.out.println(this + " has no crew, hire some pirates!");
      return 0;
    }
  }
  
  public int score(){
    int score = this.crewInfo() - this.captainInfo();
    return score;
  }
  
  public void fillShip(String captainsName) {
    this.captain = new Pirate(captainsName, true);
    for (int i = 0; i < (int) (Math.random() * 20 + 1); i++) {
      this.crew.add(new Pirate());
    }
  }
}
