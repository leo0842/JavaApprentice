package trying;

import java.util.ArrayList;

public class CustomerTest {

  public static void main(String[] args) {
    ArrayList<Customer> customers = new ArrayList<>();
    Customer Lee = new Customer(1, "이순신");
    Customer Shin = new Customer(2, "신사임당");
    Customer Hong = new RegularCustomer(3, "홍길동");
    Customer Choi = new RegularCustomer(4, "최영");
    Customer Kim = new VIPCustomer(5, "김유신");

    customers.add(Lee);
    customers.add(Shin);
    customers.add(Hong);
    customers.add(Choi);
    customers.add(Kim);

    for (Customer customer: customers){
      customer.showCustomerInfo();
    }
    System.out.println("============================");

    int price = 10000;
    for (Customer customer: customers){
      System.out.println( customer.calcPrice(price));
      customer.showCustomerInfo();
    }

  }
}
