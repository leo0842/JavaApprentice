package trying;

import java.util.ArrayList;

import java.util.Objects;

class StreamCustomer {

  private int customerId;
  private String customerName;
  private int age;
  private int cost;

  public StreamCustomer(int customerId, String customerName, int age, int cost) {
    this.customerId = customerId;
    this.customerName = customerName;
    this.age = age;
    this.cost = cost;
  }

  public String getCustomerName() {
    return customerName;
  }

  public int getCustomerId() {
    return customerId;
  }

  public int getAge() {
    return age;
  }

  public int getCost() {
    return cost;
  }

  public void setCustomerId(int customerId) {
    this.customerId = customerId;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setCost(int cost) {
    this.cost = cost;
  }

  @Override
  public String toString() {
    return customerName;
  }
}

public class StreamTest {

  public static void main(String[] args) {
    ArrayList<StreamCustomer> customers = new ArrayList<>();

    StreamCustomer Lee = new StreamCustomer(1, "Lee", 40, 100);
    StreamCustomer Kim = new StreamCustomer(2, "Kim", 20, 100);
    StreamCustomer Hong = new StreamCustomer(3, "Hong", 13, 50);

    customers.add(Lee);
    customers.add(Kim);
    customers.add(Hong);
    System.out.println("Q1");
    customers.forEach(streamCustomer -> System.out.print(streamCustomer.getCustomerName() + " "));
    System.out.println("\n" + "Q2");
    System.out.println(customers.stream().map(streamCustomer -> streamCustomer.getCost()).reduce(0, (i, j) -> i + j));
    System.out.println("Q3");
    customers.stream().filter(streamCustomer -> streamCustomer.getAge() >= 20).map(streamCustomer -> streamCustomer.getCustomerName()).sorted()
        .forEach(s -> System.out.println(s));
  }

}
