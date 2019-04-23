import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
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
  
  private int priorityAmmoNeed() {
    int priorityAmmo = 0;
    for (int i = 0; i < this.fleet.size(); i++) {
      if (this.fleet.get(i).isPriority()) {
        priorityAmmo += this.fleet.get(i).getMaxAmmo() - this.fleet.get(i).getCurrentAmmo();
      }
    }
    return priorityAmmo;
  }
  
  public void fill() {

    int priorityAmmo;
    int nonPriorityAmmo;
    
    if (this.ammo > this.priorityAmmoNeed()){
      priorityAmmo = this.priorityAmmoNeed();
      nonPriorityAmmo = this.ammo - priorityAmmo;
    } else {
      priorityAmmo = this.ammo;
      nonPriorityAmmo =0;
    }
    
    for (int i = 0; i < this.fleet.size(); i++) {
      if (this.fleet.get(i).isPriority()) {
        priorityAmmo -= this.fleet.get(i).refill(priorityAmmo);
        
      } else {
        nonPriorityAmmo -= this.fleet.get(i).refill(nonPriorityAmmo);
      }
    }
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
