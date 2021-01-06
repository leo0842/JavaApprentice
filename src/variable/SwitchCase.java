package variable;

import java.util.Scanner;

public class SwitchCase {
  public static void main(String[] args){
    int month;
    int day;
    Scanner scanner = new Scanner(System.in);
    month = scanner.nextInt();
    switch (month){
      case 1: case 3: case 5: case 7: case 8: case 10: case 12:
        day = 31;
        break;
      case 2:
        day = 28;
        break;
      default:
        day = 30;
        break;

    }
    System.out.println(day);
    System.out.println(month);
  }
}
