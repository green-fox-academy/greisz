import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteMultipleLines {
  public static void main(String[] args) {
    String targetPath = "assets/target.txt";
    String word = "apple";
    int lineCount = 3;
    
    writeMultipleLines(targetPath, word, lineCount);
  }
  
  public static void writeMultipleLines(String targetPath, String word, int linecount) {
    List<String> multipleLines = new ArrayList<>();
    for (int i = 0; i < linecount; i++) {
     multipleLines.add(word);
    }
    try {
      Path path = Paths.get(targetPath);
      Files.write(path, multipleLines);
      System.out.println("target.txt updated");
    } catch (IOException e) {
      System.out.println("Unable to write file: target.txt");
    }
  }
  
}
