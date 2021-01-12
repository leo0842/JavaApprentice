package trying;

import java.util.Objects;

class MyDate{
  private int year;
  private int month;
  private int day;

  public MyDate() {
  }

  public MyDate(int year, int month, int day) {
    this.year = year;
    this.month = month;
    this.day = day;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    System.out.println("check1");
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }
    System.out.println("check2");
    MyDate myDate = (MyDate) o;
    return year == myDate.year &&
        month == myDate.month &&
        day == myDate.day;
  }

  @Override
  public int hashCode() {
    return Objects.hash(year, month, day);
  }
}
public class MyDateTest {

  public static void main(String[] args) {
    MyDate myDate1 = new MyDate(2020, 12, 25);
    MyDate myDate2 = new MyDate(2020, 12, 25);
    MyDate myDate3 = new MyDate(2020, 12, 26);
    String myDate4 = "myDate4";
    System.out.println(myDate1.hashCode());
    System.out.println(myDate2.hashCode());
    System.out.println(myDate3.hashCode());
    System.out.println("==============================");
    System.out.println(myDate1.equals(myDate1));
    System.out.println(myDate1.equals(myDate4));
    System.out.println(myDate1.equals(myDate2));
    System.out.println(myDate1.equals(myDate3));
  }



}
