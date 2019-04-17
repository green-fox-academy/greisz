public class Main {
  public static void main(String[] args) {
    
    Station station1 = new Station(10000);
    Car car1 = new Car();
    System.out.println("Station #1 gas amount: " + station1.getGasAmount());
    System.out.println("Car #1 gas amount: " + car1.getGasAmount());
    station1.refill(car1);
    System.out.println("Station #1 new gas amount: " + station1.getGasAmount());
    System.out.println("Car #1 new gas amount: " + car1.getGasAmount());
  }
}
