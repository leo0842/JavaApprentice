package interfaceEx;

public class Customer implements Buy, Sell{

  @Override
  public void buy() {
    System.out.println("Customer buy");
  }

  @Override
  public void sell() {
    System.out.println("Customer sell");
  }

  @Override
  public int cost() {
    return 100;
  }

  @Override
  public void order() {
    System.out.println("Customer Order");
  }
}
