public class Main {
  public static void main(String[] args) {
    Flower yellowFlower = new Flower("yellow", 5);
    Flower blueFlower = new Flower("blue", 5);
    Tree purpleTree = new Tree("purple", 10);
    Tree orangeTree = new Tree("orange", 20);
    
    Garden firstGarden = new Garden();
    firstGarden.addPlant(yellowFlower);
    firstGarden.addPlant(blueFlower);
    firstGarden.addPlant(purpleTree);
    firstGarden.addPlant(orangeTree);
    
    
  }
}
