package statics;

public class StudentTest {

  public static void main(String[] args) {
    int a;
    System.out.println(Student.serialNumber);
    Student.setSerialNumber(1003);
    System.out.println(Student.serialNumber);
    Student.serialNumber += 1;
    System.out.println(Student.serialNumber);
    a = Student.getSerialNumber();
    System.out.println(a);
  }
}




