package generic;

public class Plastic extends BaseMaterial{

  @Override
  public String toString() {
    return "Plastic{}";
  }

  @Override
  public void doPrinting() {
    System.out.println("Plastic Printing");
  }

}
