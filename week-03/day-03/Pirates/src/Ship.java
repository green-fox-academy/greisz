import java.util.ArrayList;
import java.util.List;

public class Ship {
  String name;
  List<Pirate> crew = new ArrayList<>();
  Pirate captain = new Pirate();
  
  public Ship(String name) {
    this.name = name;
  }
  
  public void getInfo(Ship ship) {
    
    System.out.println("Ship name: " + ship.name);
    
    if (ship.captain != null) {
      System.out.println("Captain's name: " + ship.captain.getName());
      System.out.println("The captain has drunk " + ship.captain.getDrunkLevel() + " bottles ot rum.");
    } else {
      System.out.println(ship + " has no captain, hire somebody!");
    }
    
    if (ship.crew != null) {
      int crewAlive = 0;
      for (int i = 0; i < ship.crew.size(); i++) {
        if (ship.crew.get(i).isAlive() == true) {
          crewAlive++;
        }
      }
      System.out.println("Number of alive crew members: " + crewAlive);
    } else {
      System.out.println(ship + " has no crew, hire some pirates!");
    }
    
  }
  
  public void fillShip(String captainsName) {
    this.captain = new Pirate(captainsName, true);
    for (int i = 0; i < (int) (Math.random() * 20 + 1); i++) {
      this.crew.add(new Pirate());
    }
  }
}
