package date;

public class TodayValid {

  public void isValid(Today today) {
    int todayDate = today.getDate();
    int todayMonth = today.getMonth();

    if (todayDate > 0) {
      if (todayMonth == 2) {
        if (todayDate > 28) {
          today.setValid(false);
        }
      } else if (todayMonth == 1 || todayMonth == 3 || todayMonth == 5 || todayMonth == 7 || todayMonth == 8 || todayMonth == 10
          || todayMonth == 12) {
        if (todayDate > 31) {
          today.setValid(false);
        }
      } else {
        if (todayDate > 30) {
          today.setValid(false);
        }
      }

    } else {
      today.setValid(false);
    }
  }
}