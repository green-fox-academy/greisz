public class Pirate {
  int drunkLevel;
  boolean isAlive;
  boolean passedOut;
  boolean hasParrot;
  
  public Pirate() {
    this.drunkLevel = 0;
    this.passedOut = false;
    this.isAlive = true;
    this.hasParrot = false;
  }
  
  public Pirate(boolean hasParrot) {
    this.drunkLevel = 0;
    this.passedOut = false;
    this.isAlive = true;
    this.hasParrot = hasParrot;
  }
  
  private void drinkSomeRum() {
    if (this.isAlive == true) {
      if (this.drunkLevel < 4) {
        drunkLevel++;
      } else {
        this.passedOut = true;
        this.drunkLevel =0;
      }
    } else {
      System.out.println("He's dead.");
    }
  }
  
  public void howsItGoingMate() {
    if (this.isAlive == true) {
      if (this.drunkLevel < 5) {
        System.out.println("Pour me anudder!");
      } else {
        System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
      }
    } else {
      System.out.println("He's dead.");
    }
  }
  
  
}