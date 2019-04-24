import java.util.Arrays;

public class Domino implements Comparable<Domino>, Printable {
  private final int left;
  private final int right;
  
  public Domino(int left, int right) {
    this.left = left;
    this.right = right;
  }
  
  public int getLeftSide() {
    return left;
  }
  
  public int getRightSide() {
    return right;
  }
  
  @Override
  public String toString() {
    return "[" + left + ", " + right + "]";
  }
  
  @Override
  public int compareTo(Domino other) {
    if (this.getLeftSide() < other.getLeftSide()) {
      return -1;
    }
    if (this.getLeftSide() == other.getLeftSide()) {
      if (this.getRightSide() < other.getRightSide()) {
        return -1;
      }
      if (this.getRightSide() == other.getRightSide()) {
        return 0;
      }
      return 1;
    }
    return 1;
  }
  
  @Override
  public void printAllFields() {
    System.out.println("[" + this.getLeftSide() + "|" + this.getRightSide() + "]");
  }
}