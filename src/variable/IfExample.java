package variable;

import java.util.Scanner;

public class IfExample {
  public static void main(String[] args){

    int point;
    String grade;
    Scanner scanner = new Scanner(System.in);
    point = scanner.nextInt();

    if (point > 100){
      grade = "Z";
      System.out.println("거짓말");
    }
    else if (point >= 90){
      grade = "A";
    }
    else if (point >= 80){
      grade = "B";
    }
    else if (point >= 70){
      grade = "C";
    }
    else if (point >= 60){
      grade = "D";
    }
    else {
      grade = "F";
    }
    System.out.println("학점 :" + grade);
  }

}
