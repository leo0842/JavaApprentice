package classpart;

public class Person {
  String name;
  int age;
  boolean married;
  int children;

  public void showPersonInfo(){
    System.out.println("나이: " + age);
    System.out.println("이름: " + name);
    System.out.println("결혼 여부: " + married);
    System.out.println("자녀 수: " + children);
  }

}
