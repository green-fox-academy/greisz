public class Tree extends Plant {
  public Tree(String color, double waterLevel) {
    super(color, waterLevel);
    this.setDrought(10);
    this.setNeedsWater(this.getWaterLevel() < this.getDrought());
    this.setWaterUtilization(0.4);
  }
  
  @Override
  public void waterInfo() {
    if (this.isNeedsWater()) {
      System.out.println("The " + this.getColor() + " Tree needs water.");
    } else {
      System.out.println("The " + this.getColor() + " Tree doesn't need water.");
    }
  }
}
