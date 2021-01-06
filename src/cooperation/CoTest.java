package cooperation;

public class CoTest {

  public static void main(String[] args) {
    Student student1 = new Student("Leo", 4, 5000);
    Student student2 = new Student("Kim", 2, 15000);
    Bus bus420 = new Bus(420);
    Subway subway1 = new Subway(1);
    Taxi taxi300 = new Taxi(300);
    student1.moneyInfo();
    student1.takeBus(bus420);
    student1.takeSubway(subway1);
    student2.takeTaxi(taxi300, 10000);
    student1.moneyInfo();
    bus420.showMoney();
    subway1.showMoney();
    taxi300.showMoney();
    student2.moneyInfo();

  }


}
