public class Sharpie {
  String color;
  double width;
  double inkAmount;
  
  public Sharpie(String color, double width, double inkAmount) {
    this.color = color;
    this.width = width;
    this.inkAmount = inkAmount;
  }
  
  public double getInkAmount() {
    return inkAmount;
  }
  
  public void use() {
    this.inkAmount--;
  }
  
}
