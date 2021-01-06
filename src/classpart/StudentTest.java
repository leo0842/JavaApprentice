package classpart;;

public class StudentTest {

  public static void main(String[] args) {
    Student studentLee = new Student();

    studentLee.studentAddress = "Seoul";
    studentLee.studentName = "성산";
    studentLee.studentID = 1;
    studentLee.showStudentName();
    System.out.println(Student.addNum(13, 2));
  }
}
