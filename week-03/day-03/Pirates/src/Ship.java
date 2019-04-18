import java.util.ArrayList;
import java.util.List;

public class Ship {
  String name;
  List<Pirate> crew = new ArrayList<>();
  Pirate captain = new Pirate();
  
  public Ship(String name) {
    this.name = name;
  }
  
  public void fillShip(String captainsName) {
    this.captain = new Pirate(captainsName, true);
    for (int i = 0; i < (int) (Math.random() * 20 + 1); i++) {
      this.crew.add(new Pirate());
    }
  }
  
  public void getInfo() {
    System.out.println("Ship name: " + this.name);
    this.captainsRum();
    this.aliveCrew();
  }
  
  public int captainsRum() {
    if (this.captain != null) {
      System.out.println("Captain's name: " + this.captain.getName());
      System.out.println("The captain has drunk " + this.captain.getDrunkLevel() + " bottles ot rum.");
      return this.captain.getDrunkLevel();
    } else {
      System.out.println(this + " has no captain, hire somebody!");
      return 0;
    }
  }
  
  public int aliveCrew() {
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
  
  public int score() {
    return this.aliveCrew() - this.captainsRum();
  }
  
  public boolean battle(Ship otherShip) {
    if (this.score() > otherShip.score()) {
      this.winBattle();
      otherShip.loseBattle();
      return true;
    } else {
      this.loseBattle();
      otherShip.winBattle();
      return false;
    }
  }
  
  
  public void winBattle() {
    int bootlesOfRum = (int) (Math.random() * 15 + 1);
    for (int i = 0; i < bootlesOfRum; i++) {
      this.captain.howsItGoingMate();
      for (int j = 0; j < this.aliveCrew(); j++) {
        this.crew.get(j).howsItGoingMate();
      }
    }
  }
  
  public void loseBattle() {
    int deaths = (int) (Math.random() * this.aliveCrew() + 1);
    for (int i = 0; i < deaths; i++) {
      this.crew.get(i).die();
    }
  }
  
}
