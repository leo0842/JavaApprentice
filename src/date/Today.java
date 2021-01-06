package date;

public class Today {

  private int date;
  private int month;
  private int year;
  private boolean isValid = true;

  public void setValid(boolean valid) {
    isValid = valid;
  }

  public int getDate() {
    return date;
  }

  public void setDate(int date) {
    this.date = date;
  }

  public int getMonth() {
    return month;
  }

  public void setMonth(int month) {
    this.month = month;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public void setToday(int date, int month, int year) {
    this.date = date;
    this.month = month;
    this.year = year;
  }

  public String getToday() {
    String today;
    today = date + "일 " + month + "월 " + year + "년";
    return today;
  }

  public void TodayInfo(){
    TodayValid validation = new TodayValid();
    validation.isValid(this);
    if (this.isValid){
      System.out.println(year + "/" + month + "/" + date);
    }
    else {
      System.out.println("유효하지 않은 날짜입니다.");
    }
  }
}
