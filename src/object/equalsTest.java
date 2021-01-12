package object;

class Student {

  int id;
  String name;

  public Student(int id, String name) {
    this.id = id;
    this.name = name;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Student) {
      Student std = (Student) obj;
      return std.id == this.id;
    }
    return false;
  }
}

public class equalsTest {

  public static void main(String[] args) {
    String str1 = new String("abc");
    String str2 = new String("abc");
    String str3 = "abc";
    String str4 = "abc";
    Student Lee = new Student(100, "Yeondong");
    Student Lee2 = new Student(100, "Yeondong");
    System.out.println(str1.hashCode());
    System.out.println(str2.hashCode());
    System.out.println(str1==str2);
    System.out.println(System.identityHashCode(str1));
    System.out.println(System.identityHashCode(str2));
    System.out.println(System.identityHashCode(str3));
    System.out.println(System.identityHashCode(str4));
//    System.out.println(Lee.equals(Lee2));
//    System.out.println("====================");
//    System.out.println(str1.hashCode());
//    System.out.println(str2.hashCode());
//    System.out.println(str3.hashCode());
//    System.out.println(str4.hashCode());
//    System.out.println("====================");
//    System.out.println(str1 == str2);
//    System.out.println(str1 == str3);
//    System.out.println(str4 == str3);
//    System.out.println(str1.equals(str2));
//    System.out.println(str1.equals(str3));
//    System.out.println(str4.equals(str3));
  }
}
