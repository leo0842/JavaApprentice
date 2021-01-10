package trying;

public class RegularCustomer extends Customer{
   double salesRatio;

  public RegularCustomer() {
    salesRatio = 0.1;
    customerGrade = "GOLD";
    bonusRatio = 0.02;
  }

  public RegularCustomer(int customerId, String customerName) {
    super(customerId, customerName);
    salesRatio = 0.1;
    customerGrade = "GOLD";
    bonusRatio = 0.02;

  }

  @Override
  public int calcPrice(int price) {
    bonusPoint += (int)(bonusRatio * price);
    return (int)(price - price * salesRatio);
  }
}
