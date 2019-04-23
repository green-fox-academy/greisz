import java.util.ArrayList;
import java.util.List;

public class Garden {
  private List<Plant> plants;
  
  public Garden() {
    plants = new ArrayList<>();
  }
  
  public void addPlant(Plant newPlant) {
    this.plants.add(newPlant);
  }
  
  private int thirsty() {
    int thirstyPlants = 0;
    for (int i = 0; i < this.plants.size(); i++) {
      if (this.plants.get(i).isNeedsWater()) {
        thirstyPlants++;
      }
    }
    return thirstyPlants;
  }
  
  public void wateringGarden(double totalWater) {
    double waterForEach = totalWater / this.thirsty();
    for (int i = 0; i < this.plants.size(); i++) {
      if (this.plants.get(i).isNeedsWater()) {
        this.plants.get(i).watering(waterForEach);
      }
    }
  }
  
  public void gardenWaterInfo() {
    for (int i = 0; i < this.plants.size(); i++) {
      this.plants.get(i).waterinfo();
    }
    System.out.println();
  }
}
