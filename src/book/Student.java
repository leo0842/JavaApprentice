package book;

import java.util.ArrayList;

public class Student {

  int studentId;
  String studentName;
  ArrayList<Book> bookArrayList;
  String str = "";
  public Student(int studentId, String studentName) {
    this.studentId = studentId;
    this.studentName = studentName;

    bookArrayList = new ArrayList<Book>();

  }

  public void showBookInfo(){
    for (Book value : bookArrayList) {
      String nameId;
      nameId = value.getBookName() + value.getBookId() + " ";
      str += nameId;
    }
    System.out.println(studentName + ": " + str + "입니다.");
  }

}
