package cooperation;

public class Subway {
  int subwayNumber;
  int passengerCount = 0;
  int money = 0;

  public Subway(int subwayNumber) {
    this.subwayNumber = subwayNumber;
  }
  public void takeOn(int money){
    this.money += money;
    this.passengerCount++;
  }


  public  void showMoney(){
    System.out.println("버스 수익은 "+money);
    System.out.println("번호와 승객은 " + subwayNumber + "," + passengerCount);
  }

}
