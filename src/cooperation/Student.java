package cooperation;

public class Student {

  String name;
  int grade;
  int money;

  public Student(String name, int grade, int money) {
    this.name = name;
    this.grade = grade;
    this.money = money;
  }

  public void takeBus(Bus bus){
    bus.takeOn(1000);
    this.money -= 1000;
  }

  public void takeSubway(Subway subway){
    subway.takeOn(1200);
    this.money -= 1200;
  }

  public void takeTaxi(Taxi taxi, int money){
    taxi.takeOn(money);
    this.money -= money;
  }
  public void moneyInfo() {
    System.out.println(name + "의 잔액은 " + money);
  }
}
