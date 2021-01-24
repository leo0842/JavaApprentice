package thread;

class Bank {

  private int money = 10000;

  public void saveMoney(int money) {
    int m = getMoney();
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    setMoney(money + m);
  }

  public void minusMoney(int money){
    int m = getMoney();
    try {
      Thread.sleep(200);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    setMoney(m - money);
  }

  public int getMoney() {
    return money;
  }

  public void setMoney(int money) {
    this.money = money;
  }
}

class Park extends Thread {

  public void run() {

    System.out.println(SyncTest.myBank.getMoney());
    SyncTest.myBank.saveMoney(3000);;
    System.out.println(SyncTest.myBank.getMoney());
  }
}

class ParkWife extends Thread {

  public void run(){
    System.out.println(SyncTest.myBank.getMoney());
    SyncTest.myBank.minusMoney(4000);
    System.out.println(SyncTest.myBank.getMoney());
  }
}
public class SyncTest {

  public static Bank myBank = new Bank();

  public static void main(String[] args) throws InterruptedException {

    Park park = new Park();
    park.start();
    Thread.sleep(5000);
    ParkWife parkWife = new ParkWife();
    parkWife.start();
  }
}
