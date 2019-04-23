public class Plant {
  private double waterLevel;
  private boolean needsWater;
  private double waterUtilization;
  
  public Plant() {
  }
  
  public Plant(double waterLevel) {
    this.waterLevel = waterLevel;
  }
  
  public double getWaterLevel() {
    return waterLevel;
  }
  
  public void setWaterLevel(double waterLevel) {
    this.waterLevel = waterLevel;
  }
  
  public boolean isNeedsWater() {
    return needsWater;
  }
  
  public void setNeedsWater(boolean needsWater) {
    this.needsWater = needsWater;
  }
  
  public double getWaterUtilization() {
    return waterUtilization;
  }
  
  public void setWaterUtilization(double waterUtilization) {
    this.waterUtilization = waterUtilization;
  }
  
  public void watering(double waterAmount) {
    this.setWaterLevel(this.getWaterLevel() + waterAmount * waterUtilization);
  }
  
}
