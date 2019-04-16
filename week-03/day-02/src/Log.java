import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Log {
  public static void main(String[] args) {
    String logPath = "assets/log.txt";
    System.out.println(postGetRatio(logPath));
  }
  
  public static double postGetRatio(String logPath) {
    try {
      Path target = Paths.get(logPath);
      List<String> logData = Files.readAllLines(target);
      double post = 0;
      double get = 0;
      for (int i = 0; i < logData.size(); i++) {
        if (logData.get(i).contains("POST")) {
          post++;
        } else {
          get++;
        }
      }
      double ratio = get / post;
      return ratio;
    } catch (IOException e) {
      System.out.println("Unable to read log");
      return 0;
    }
  }
}
