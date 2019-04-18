public class BattleApp {
  public static void main(String[] args) {
    Ship ship1 = new Ship("Ship 1");
    ship1.fillShip("Captain 1");
    ship1.getInfo();
    
    Ship ship2 = new Ship("Ship 2");
    ship2.fillShip("Captain 2");
    ship2.getInfo();
    
    ship1.battle(ship2);
    
    ship1.getInfo();
    ship2.getInfo();
  }
}
