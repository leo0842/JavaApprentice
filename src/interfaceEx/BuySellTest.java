package interfaceEx;

public class BuySellTest {

  public static void main(String[] args) {
    Customer customer = new Customer();
    customer.buy();
    customer.cost();
    customer.order();
    customer.sell();
    Sell.ad();

    //업캐스팅, 하위 클래스 메소트 호출 X, 가지고 있는 메소드도 오버라이딩 됨.
    Buy buyer = new Customer();
    buyer.buy();
    buyer.order();

  }
}
