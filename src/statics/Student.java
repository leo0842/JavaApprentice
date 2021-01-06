package statics;

public class Student {
  public static int serialNumber = 1000;
  private int id;
  public String name;
  public String address;

  public Student(String name) {
    this.name = name;
    Student.serialNumber++;
    this.id = Student.serialNumber;

  }

  public Student(int id, String name) {
    this.id = id;
    this.name = name;
    Student.serialNumber++;
  }

  public static int getSerialNumber() {
    return serialNumber;
  }

  public static void setSerialNumber(int serialNumber) {
    Student.serialNumber = serialNumber;
  }

  public void studentIdInfo(){
    System.out.println(this.id);
  }
}
