package trying;

public class Customer {

  protected int customerId;
  protected String customerName;
  protected String customerGrade;
  int bonusPoint;
  double bonusRatio;

  public Customer() {
    customerGrade = "SILVER";
    bonusRatio = 0.01;
    bonusPoint = 0;

  }

  public Customer(int customerId, String customerName) {
    this.customerId = customerId;
    this.customerName = customerName;
    customerGrade = "SILVER";
    bonusRatio = 0.01;
    bonusPoint = 0;
  }

  public int calcPrice(int price) {
    bonusPoint += (int) (bonusRatio * price);
    return price;

  }

  public void showCustomerInfo() {
    System.out.println(customerGrade + bonusPoint + "," + bonusRatio + "\n" + "등급, 포인트, 비율");
  }

  //getter and setter
  public int getCustomerId() {
    return customerId;
  }

  public void setCustomerId(int customerId) {
    this.customerId = customerId;
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public String getCustomerGrade() {
    return customerGrade;
  }

  public void setCustomerGrade(String customerGrade) {
    this.customerGrade = customerGrade;
  }
}
