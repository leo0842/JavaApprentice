package classpart;

public class Student {
  int studentID;
  String studentAddress;
  String studentName;

  public void showStudentName(){
    System.out.println(studentName);
  }

  public static int addNum(int num1, int num2){
    int result;
    result = num1 + num2;
    return result;
  }
}
