public class Main {
  public static void main(String[] args) {
    Flower yellowFlower = new Flower("yellow", 0);
    Flower blueFlower = new Flower("blue", 0);
    Tree purpleTree = new Tree("purple", 0);
    Tree orangeTree = new Tree("orange", 0);
    
    Garden firstGarden = new Garden();
    
    firstGarden.addPlant(yellowFlower);
    firstGarden.addPlant(blueFlower);
    firstGarden.addPlant(purpleTree);
    firstGarden.addPlant(orangeTree);
    
    firstGarden.gardenWaterInfo();
    
    firstGarden.wateringGarden(40);
    firstGarden.gardenWaterInfo();
    
    firstGarden.wateringGarden(70);
    firstGarden.gardenWaterInfo();
  }
}
