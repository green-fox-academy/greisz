import java.util.ArrayList;
import java.util.List;

public class Carrier {
  private List<Aircraft> fleet;
  private int ammo;
  private int healthPoint;
  
  public Carrier(int ammo, int healthPoint) {
    this.fleet = new ArrayList<>();
    this.ammo = ammo;
    this.healthPoint = healthPoint;
  }
  
  public void add(Aircraft aircraft) {
    this.fleet.add(aircraft);
  }
  
  private int totalDamage() {
    int damage = 0;
    for (int i = 0; i < this.fleet.size(); i++) {
      damage += this.fleet.get(i).fight();
    }
    return damage;
  }
  
  public void fight(Carrier otherCarrier) {
    if (otherCarrier.healthPoint > this.totalDamage()) {
      otherCarrier.healthPoint -= this.totalDamage();
    } else {
      otherCarrier.healthPoint = 0;
    }
  }
}
