import java.util.Scanner;

public class Cuboid {
  public static void main(String[] args){
    double a;
    double b;
    double c;
    double surface;
    double volume;
    Scanner scan = new Scanner(System.in);
  
    System.out.println("Enter side #a of the cuboid: ");
    a = scan.nextDouble();
    System.out.println("Enter side #b of the cuboid: ");
    b = scan.nextDouble();
    System.out.println("Enter side #c of the cuboid: ");
    c = scan.nextDouble();
    surface = 2 * ( a * b + b * c + a * c);
    volume = a * b * c;
  
    System.out.println("Surface area of the cuboid is: " + surface);
    System.out.println("Volume of the cuboid is : " + volume);
  }
}
