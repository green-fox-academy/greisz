public class Flower extends Plant {
  public Flower(String color, double waterLevel) {
    super(color, waterLevel);
    this.setDrought(5);
    this.setNeedsWater(this.getWaterLevel() < this.getDrought());
    this.setWaterUtilization(0.75);
  }
  
  @Override
  public void waterInfo() {
    if (this.isNeedsWater()) {
      System.out.println("The " + this.getColor() + " Flower needs water.");
    } else {
      System.out.println("The " + this.getColor() + " Flower doesn't need water.");
    }
  }
}