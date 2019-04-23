public class Tree extends Plant {
  public void watering (double waterAmount) {
    this.setWaterLevel(this.getWaterLevel() + waterAmount * 0.4) ;
  }
}
