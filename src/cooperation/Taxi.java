package cooperation;

public class Taxi {
  int taxiNumber;
  int money;

  public Taxi(int taxiNumber) {
    this.taxiNumber = taxiNumber;
  }
  public void takeOn(int money){
    this.money += money;
  }
  public void showMoney(){
    System.out.println(taxiNumber + "," + money + "택시 번호, 수익");
  }
}
