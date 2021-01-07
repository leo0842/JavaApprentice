package inheritance;

public class Customer {

  protected int customerId;
  protected String customerName;
  protected String customerGrade;
  int bonusPoint;
  double bonusRatio;

  public Customer() {
    customerGrade = "Silver";
    bonusRatio = 0.01;
  }

  public Customer(int customerId, String customerName) {
    this.customerId = customerId;
    this.customerName = customerName;
  }

  public int calPrice(int price) {
    bonusPoint += bonusRatio * price;
    return price;
  }

  public void showCustomerInfo() {
    System.out.println(customerName + "," + customerGrade + "," + bonusPoint + "이름, 등급, 점수");
  }

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
