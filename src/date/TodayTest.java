package date;

public class TodayTest {

  public static void main(String[] args) {
    String a;
    Today today1 = new Today();
    today1.setYear(2020);
    today1.setDate(25);
    today1.setMonth(12);
    Today today2 = new Today();
    today2.setToday(31, 12, 2020);


    today1.TodayInfo();
    today2.TodayInfo();
    a = today2.getToday();
    System.out.println(a);
  }

}
