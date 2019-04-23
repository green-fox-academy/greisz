public class Aircraft {
  private int currentAmmo;
  private int maxAmmo;
  private int baseDamage;
  
  public Aircraft() {
    this.setCurrentAmmo(0);
  }
  
  public int getCurrentAmmo() {
    return currentAmmo;
  }
  
  public void setCurrentAmmo(int currentAmmo) {
    this.currentAmmo = currentAmmo;
  }
  
  public int getMaxAmmo() {
    return maxAmmo;
  }
  
  public void setMaxAmmo(int maxAmmo) {
    this.maxAmmo = maxAmmo;
  }
  
  public int getBaseDamage() {
    return baseDamage;
  }
  
  public void setBaseDamage(int baseDamage) {
    this.baseDamage = baseDamage;
  }
  
  public int fight() {
    return this.getCurrentAmmo() * this.getBaseDamage();
  }
  
  public void refill(int load) {
    if (this.getCurrentAmmo() + load > this.getMaxAmmo()) {
      this.setCurrentAmmo(this.getMaxAmmo());
    } else {
      this.setCurrentAmmo(this.getCurrentAmmo() + load);
    }
  }
  
  public String getType() {
    return "Aircraft";
  }
  
  public String getStatus() {
    return "Type: " + this.getType() +
            " Ammo: " + this.getCurrentAmmo() +
            " Base damage: " + this.getBaseDamage() +
            " All Damage: " + this.fight();
  }
  
  public boolean isPriority() {
    return this.getType() == "F35";
  }
}
