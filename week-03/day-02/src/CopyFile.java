import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
  public static void main(String[] args) {
    String sourcePath = "assets/my-file.txt";
    String targetPath = "assets/target2.txt";
    copyFile(sourcePath,targetPath);
  }
  
  public static void copyFile(String sourcePath, String targetPath) {
    try {
      Path source = Paths.get(sourcePath);
      Path target = Paths.get(targetPath);
      List<String> content = Files.readAllLines(source);
      Files.write(target, content);
      System.out.println("File copied");
  
    } catch (IOException e) {
      System.out.println("Unable to copy file.");
    }
  }
}

