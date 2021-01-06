package cooperation;

public class Bus {
  int busNumber;
  int passengerCount = 0;
  int money = 0;

  public Bus(int busNumber) {
    this.busNumber = busNumber;
  }
  public void takeOn(int money){
    this.money += money;
    this.passengerCount++;
  }


  public  void showMoney(){
    System.out.println("버스 수익은 "+money);
    System.out.println("번호와 승객은 " + busNumber + "," + passengerCount);
  }
}
