public class Station {
  private int gasAmount;
  
  public Station(int gasAmount) {
    this.gasAmount = gasAmount;
  }
  
  public int getGasAmount() {
    return gasAmount;
  }
  
  public void refill(Car car) {
    int fueled = car.getCapacity() - car.getGasAmount();
    this.gasAmount = this.gasAmount - fueled;
    car.setGasAmount(car.getCapacity());
  }
  
}
