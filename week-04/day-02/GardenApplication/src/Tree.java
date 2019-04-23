public class Tree extends Plant {
  public Tree(double waterLevel) {
    super(waterLevel);
    this.setNeedsWater(this.getWaterLevel() < 10);
    this.setWaterUtilization(0.4);
  }
  
}
