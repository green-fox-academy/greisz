public class Pirate {
  private String name;
  private int drunkLevel;
  private boolean isAlive;
  private boolean passedOut;
  private boolean hasParrot;
  
  public Pirate() {
    this.drunkLevel = 0;
    this.passedOut = false;
    this.isAlive = true;
    this.hasParrot = false;
  }
  
  public Pirate(String name, boolean hasParrot) {
    this.name = name;
    this.drunkLevel = 0;
    this.passedOut = false;
    this.isAlive = true;
    this.hasParrot = hasParrot;
  }
  
  public String getName() {
    return name;
  }
  
  public int getDrunkLevel() {
    return drunkLevel;
  }
  
  public boolean isAlive() {
    return isAlive;
  }
  
  public boolean isPassedOut() {
    return passedOut;
  }
  
  private void drinkSomeRum() {
    if (this.isAlive) {
      drunkLevel++;
    } else {
      System.out.println("He's dead.");
    }
    
  }
  
  public void howsItGoingMate() {
    if (this.ableToDo()) {
      if (this.drunkLevel < 5) {
        System.out.println("Pour me anudder!");
        this.drinkSomeRum();
      } else {
        System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
        this.sleep();
      }
    } else {
      System.out.println("He's dead.");
    }
  }
  
  public void sleep() {
    if (this.isAlive) {
      this.passedOut = false;
      this.drunkLevel = 0;
    } else {
      System.out.println("He's dead.");
    }
  }
  
  public void die() {
    this.isAlive = false;
  }
  
  public void passOut() {
    if (this.isAlive) {
      this.passedOut = true;
    } else {
      System.out.println("He's dead.");
    }
  }
  
  public boolean ableToDo() {
    return  (this.isAlive && !this.passedOut);
  }
  
  public void brawl(Pirate otherPirate) {
    if (this.ableToDo() && otherPirate.ableToDo()) {
      int outcome = (int) (Math.random() * 3 + 1);
      switch (outcome) {
        case 1:
          this.die();
        case 2:
          otherPirate.die();
        case 3:
          this.passOut();
          otherPirate.passOut();
      }
    } else {
      System.out.println("You can not fight!");
    }
  }
  
  
}