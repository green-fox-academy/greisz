public class Flower extends Plant {
  public void watering (double waterAmount) {
    this.setWaterLevel(this.getWaterLevel() + waterAmount * 0.75) ;
  }
}
