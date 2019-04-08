import java.util.Scanner;

public class BMI {
  public static void main(String[] args){
    double massInKg;
    double heightInCm;
    double bmiRounded;
    double bmiDouble;
    
    Scanner scan = new Scanner(System.in);
  
    System.out.println("Enter your weight (in kg):");
    massInKg = scan.nextDouble();
    System.out.println("Enter your height (in cm):");
    heightInCm = scan.nextDouble();
    
    bmiRounded = Math.round ((massInKg / ( Math.pow(heightInCm / 100, 2))) * 100.) / 100.;
    bmiDouble = massInKg / ( Math.pow(heightInCm / 100, 2));
    
    System.out.println("Your BMI is: " + bmiDouble + "    //unformatted");
    System.out.println("Your BMI is: " + bmiRounded + "    //Math.round <-- period as decimal separator, Java default");
    System.out.format("Your BMI is: " + "%.2f" + "    //System.out.format  <-- comma as decimal separator, HUN sys default", bmiDouble );
  }
}
