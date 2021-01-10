package trying;

public class VIPCustomer extends Customer{
  private String agent;
  double salesRatio;

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
  public int calcPrice(int price) {
    bonusPoint += bonusRatio * price;
    return (int) (price - price * salesRatio);
  }
}
