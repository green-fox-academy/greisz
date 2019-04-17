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
    if (this.inkAmount > 0) {
      this.inkAmount--;
    } else {
      System.out.println("This sharpie is empty!");
    }
  }
  
}
