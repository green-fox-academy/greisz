public class Counter {
  int initialValue = 0;
  int value = initialValue;
  
  
  public static void main(String[] args) {
  
  }
  
  public Counter() {
  }
  
  public Counter(int initialValue) {
    this.initialValue = initialValue;
  }
  
  public void add(int number) {
    this.value = this.value + number;
  }
  
  public void add() {
    this.value++;
  }
  
  public int get(){
    return this.value;
  }
  
  public void reset() {
    this.value = this.initialValue;
  }
}


