package generic;

public class Powder extends BaseMaterial{

  @Override
  public String toString() {
    return "Powder{}";
  }

  @Override
  public void doPrinting() {
    System.out.println("Powder Printing");
  }
}
