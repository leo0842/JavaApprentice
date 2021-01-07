package inheritance;

public class CustomerTest {

  public static void main(String[] args) {
    Customer Lee = new Customer();
    Customer Kim = new VIPCustomer(10020, "김유신");
    Lee.setCustomerName("이순신");
    Lee.setCustomerId(10010);
    Lee.bonusPoint = 1000;
    Kim.bonusPoint = 1000;
    System.out.println(Lee.calPrice(10000));
    System.out.println(Kim.calPrice(10000));

    Lee.showCustomerInfo();
    Kim.showCustomerInfo();

  }

}
