import java.util.ArrayList;
import java.util.List;

public class Ship {
  
  List<Pirate> crew = new ArrayList<>();
  Pirate captain = new Pirate();
  
  public void fillShip() {
    this.captain = new Pirate(true);
    for (int i = 0; i < (int) (Math.random() * 20 + 1); i++;
    this.crew.add(new Pirate());
  }
}
