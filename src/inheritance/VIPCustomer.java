package inheritance;

public class VIPCustomer extends Customer {

  double salesRatio;
  private String agentID;

  public VIPCustomer() {
    salesRatio = 0.1;
    customerGrade = "VIP";
    bonusRatio = 0.05;
  }

  public VIPCustomer(int customerId, String customerName) {
    super(customerId, customerName);
    salesRatio = 0.1;
    customerGrade = "VIP";
    bonusRatio = 0.05;
  }

  @Override
  public int calPrice(int price) {
    bonusPoint += bonusRatio * price;
    return price - (int)(price * salesRatio);
  }
}
