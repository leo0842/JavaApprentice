package hiding;

public class MyDateTest {

  public static void main(String[] args) {
    int aa;
    MyDate date1 = new MyDate();
    aa = date1.getDate();
    date1.setDate(2);
    date1.year = 2020;

    date1.showDateInfo();
    System.out.println(aa + "HI");
    System.out.println(date1);
    System.out.println(date1.getSelf());
  }
}
