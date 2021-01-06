package hiding;

public class MyDate {
  private int date;
  int month;
  int year;

  public MyDate(){
    this(1);
  }

  public MyDate(int month){
    this.month = month;
  }

  public void setDate(int date) {
    this.date = date;
  }
  public int getDate() {
    return date;
  }
  public void showDateInfo(){
    System.out.println(year + "\n" + month+ "\n" + date);
  }
  public MyDate getSelf(){
    return this;
  }
}
