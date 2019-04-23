public class Flower extends Plant {
  
  public Flower(double waterLevel) {
    super(waterLevel);
    this.setNeedsWater(this.getWaterLevel() < 5);
    this.setWaterUtilization(0.75);
  }
}
