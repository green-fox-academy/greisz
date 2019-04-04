public class VariableMutation {
  public static void main(String[] args){
    
    int a = 3;
    a = a + 10;
    System.out.println(a);
  
    int b = 100;
    b = b - 7;
    System.out.println(b);
  
    int c = 44;
    c = c * 2;
    System.out.println(c);
  
    int d = 125;
    d = d / 5;
    System.out.println(d);
    
    double e = 8;
    e = Math.pow(e, 3);
    System.out.format("%.0f\n", e);
  
    int f1 = 123;
    int f2 = 345;
    boolean f1IsLarger;
    if (f1 > f2) {
      f1IsLarger = true;
    } else {
      f1IsLarger = false;
    }
    System.out.println("f1 is larger than f2: " + f1IsLarger);
  
    int g1 = 350;
    int g2 = 200;
    boolean doubleOfg2IsLarger;
    if (2 * g2 > g1) {
      doubleOfg2IsLarger = true;
    } else {
      doubleOfg2IsLarger = false;
    }
    System.out.println("Double of g2 is larger than g1: " + doubleOfg2IsLarger);
  
    int h = 135798745;
    boolean divisor;
    if (h % 11 == 0) {
      divisor = true;
    }else {
      divisor = false;
    }
    System.out.println("11 is divisor of h: " + divisor);
  
    int i1 = 10;
    int i2 = 3;
    boolean i1IsInInterval;
    if ( i1 >  Math.pow(i2, 2) && i1 < Math.pow(i2, 3) ) {
      i1IsInInterval = true;
    } else {
      i1IsInInterval = false;
    }
    System.out.println("i1 is higher than i2 squared and smaller than i2 cubed: " + i1IsInInterval);
    
    int j = 1521;
    boolean jIsDividable;
    if (j % 3 == 0 || j % 5 == 0 ) {
      jIsDividable = true;
    } else {
      jIsDividable = false;
    }
    System.out.println("tell if j is dividable by 3 or 5: " + jIsDividable);
    // tell if j is dividable by 3 or 5 (print as a boolean)
  }
}
