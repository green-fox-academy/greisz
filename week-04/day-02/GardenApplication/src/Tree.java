public class Tree extends Plant {
  public Tree(String color, double waterLevel) {
    super(color, waterLevel);
    this.setNeedsWater(this.getWaterLevel() < 10);
    this.setWaterUtilization(0.4);
  }
}
