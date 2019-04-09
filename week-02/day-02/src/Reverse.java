public class Reverse {
  
  public static String reverse(String toBeReversed) {
    String reversed = new String();
    for (int i = 0; i < toBeReversed.length(); i++) {
      reversed = toBeReversed.charAt(i) + reversed;
    }
    return reversed;
  }
  
  public static void main(String... args){
    String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
    System.out.println(reverse(reversed));
  }
}