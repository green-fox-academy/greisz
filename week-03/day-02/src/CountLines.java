
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;

public class CountLines {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String userPath = scanner.next();
    try {
      Path filePath = Paths.get(userPath);
      List<String> myString = Files.readAllLines(filePath);
      System.out.println("There are " + myString.size() + " lines int this file.");
    } catch (IOException e) {
      System.out.println("Unable to read file: my-file.txt");
    }
  }
}
