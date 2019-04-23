public class Plant {
  private double waterLevel;
  private boolean needsWater;
  private double waterUtilization;
  private double drought;
  private String color;
  
  public Plant() {
  }
  
  public Plant(String color, double waterLevel) {
    this.color = color;
    this.waterLevel = waterLevel;
  }
  
  public double getWaterLevel() {
    return waterLevel;
  }
  
  public void setWaterLevel(double waterLevel) {
    this.waterLevel = waterLevel;
  }
  
  public String getColor() {
    return color;
  }
  
  public boolean isNeedsWater() {
    return needsWater;
  }
  
  public void setNeedsWater(boolean needsWater) {
    this.needsWater = needsWater;
  }
  
  public double getDrought() {
    return drought;
  }
  
  public void setDrought(double drought) {
    this.drought = drought;
  }
  
  public void waterInfo() {
    if (this.isNeedsWater()) {
      System.out.println("The " + this.getColor() + " Plant needs water.");
    } else {
      System.out.println("The " + this.getColor() + " Plant doesn't need water.");
    }
  }
  
  public void setWaterUtilization(double waterUtilization) {
    this.waterUtilization = waterUtilization;
  }
  
  public void watering(double waterAmount) {
    this.setWaterLevel(this.getWaterLevel() + waterAmount * waterUtilization);
    if (this.getWaterLevel() < this.getDrought()) {
      this.setNeedsWater(true);
    } else {
      this.setNeedsWater(false);
    }
  }
  
}
