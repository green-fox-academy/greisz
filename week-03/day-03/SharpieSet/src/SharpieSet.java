import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
  List<Sharpie> pencilbox = new ArrayList<>();
  
  public void add(Sharpie sharpie) {
    pencilbox.add(sharpie);
  }
  
  public List<Sharpie> getPencilbox() {
    return pencilbox;
  }
  
  public int countUsable() {
    int counter = 0;
    for (int i = 0; i < pencilbox.size(); i++) {
      if (pencilbox.get(i).inkAmount != 0) {
        counter++;
      }
    }
    return counter;
  }
  
  public void removeTrash() {
    for (int i = 0; i < pencilbox.size(); i++) {
      if (pencilbox.get(i).inkAmount == 0) {
        pencilbox.remove(i);
      }
    }
  }
  
  public void setPencilbox(List<Sharpie> pencilbox) {
    this.pencilbox = pencilbox;
  }
}
