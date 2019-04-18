import java.util.ArrayList;
import java.util.List;

public class Ship {
  private String name;
  private List<Pirate> crew = new ArrayList<>();
  private Pirate captain = new Pirate();
  
  public Ship(String name) {
    this.name = name;
  }
  
  public void fillShip(String captainsName) {
    this.captain = new Pirate(captainsName, true);
    for (int i = 0; i < (int) (Math.random() * 30 + 10); i++) {
      this.crew.add(new Pirate());
    }
  }
  
  public void getInfo() {
    System.out.println("Ship name: " + this.name);
    this.captainInfo();
    this.crewinfo();
    System.out.println("Score: " + this.score());
    System.out.println();
  }
  
  public void captainInfo() {
    if (this.captain != null) {
      System.out.println("Captain's name: " + this.captain.getName());
      System.out.println("The captain has drunk " + this.captain.getDrunkLevel() + " bottles of rum.");
    } else {
      System.out.println(this.name + " has no captain, hire somebody!");
    }
  }
  
  public int captainsRum() {
    if (this.captain != null) {
      return this.captain.getDrunkLevel();
    } else {
      return 0;
    }
  }
  
  public void crewinfo() {
    if (this.aliveCrew() != 0) {
      System.out.println("Number of alive crew members: " + aliveCrew());
    } else {
      System.out.println(this.name + " has no crew, hire some pirates!");
    }
  }
  
  public int aliveCrew() {
    if (this.crew != null) {
      int stillAlive = 0;
      for (int i = 0; i < this.crew.size(); i++) {
        if (this.crew.get(i).isAlive() == true) {
          stillAlive++;
        }
      }
      return stillAlive;
    } else {
      return 0;
    }
  }
  
  public int score() {
    return this.aliveCrew() - this.captainsRum();
  }
  
  public boolean battle(Ship otherShip) {
    if (this.score() > otherShip.score()) {
      System.out.println();
      System.out.println(this.name + " wins");
      System.out.println();
      this.winBattle();
      otherShip.loseBattle();
      return true;
    } else {
      System.out.println();
      System.out.println(otherShip.name + " wins");
      System.out.println();
      this.loseBattle();
      otherShip.winBattle();
      return false;
    }
  }
  
  
  private void winBattle() {
    int bootlesOfRum = (int) (Math.random() * 15 + 1);
    for (int i = 0; i < bootlesOfRum; i++) {
      this.captain.howsItGoingMate();
//      for (int j = 0; j < this.aliveCrew(); j++) {
//        this.crew.get(j).howsItGoingMate();
//      }
    }
  }
  
  private void loseBattle() {
    int deaths = (int) (Math.random() * this.aliveCrew() + 1);
    for (int i = 0; i < deaths; i++) {
      this.crew.get(i).die();
    }
  }
  
}
