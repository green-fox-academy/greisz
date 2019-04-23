public class Flower extends Plant {
  public Flower(String color, double waterLevel) {
    super(color, waterLevel);
    this.setNeedsWater(this.getWaterLevel() < 5);
    this.setWaterUtilization(0.75);
  }
}
