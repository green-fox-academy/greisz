public class Car {
  private int gasAmount;
  private int capacity;
  
  public Car() {
    this.capacity = 100;
    this.gasAmount = 0;
  }
  
  public int getGasAmount() {
    return gasAmount;
  }
  
  public void setGasAmount(int gasAmount) {
    this.gasAmount = gasAmount;
  }
  
  public int getCapacity() {
    return capacity;
  }
}
