public class F16 extends Aircraft {
  public F16() {
    super();
    this.setMaxAmmo(8);
    this.setBaseDamage(30);
  }
  
  @Override
  public String getType() {
    return "F16";
  }
}
