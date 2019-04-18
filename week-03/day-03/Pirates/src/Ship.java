import java.util.ArrayList;
import java.util.List;

public class Ship {
  private String name;
  private List<Pirate> crew;
  private Pirate captain;
  
  public Ship(String name) {
    this.name = name;
    this.crew = new ArrayList<>();
    this.captain = new Pirate();
  }
  
  public void fillShip(String captainsName) {
    this.captain = new Pirate(captainsName, true);
    for (int i = 0; i < (int) (Math.random() * 30 + 10); i++) {
      this.crew.add(new Pirate());
    }
  }
  
  public void getInfo() {
    System.out.println("     _~       " + "Ship name: " + this.name);
    System.out.println("  _~ )_)_~    ");
    System.out.print("  )_))_))_)   ");
    this.captainInfo();
    System.out.print("  _!__!__!_   ");
    this.crewinfo();
    System.out.println("  \\______t/  ");
    System.out.print("~~~~~~~~~~~~~ ");
    System.out.println("Score: " + this.score() + "\n");
  }
  
  public void captainInfo() {
    if (this.captain != null) {
      System.out.print("Captain's name: " + this.captain.getName() + ". ");
      System.out.println("He has drunk " + this.captain.getDrunkLevel() + " bottles of rum.");
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
      System.out.println(this.name + " wins" + "\n");
      this.winBattle();
      otherShip.loseBattle();
      return true;
    } else {
      System.out.println(otherShip.name + " wins" + "\n");
      this.loseBattle();
      otherShip.winBattle();
      return false;
    }
  }
  
  private void winBattle() {
    int bottlesOfRum = (int) (Math.random() * 15 + 1);
    for (int i = 0; i < bottlesOfRum; i++) {
      this.captain.howsItGoingMate();
    }
    System.out.println();
  }
  
  private void loseBattle() {
    int deaths = (int) (Math.random() * this.aliveCrew() + 1);
    for (int i = 0; i < deaths; i++) {
      this.crew.get(i).die();
    }
  }
}
