package interfaceEx;

public interface Calc {
  double PI = 3.14;
  int ERROR = -98765;

  int add(int num1, int num2);
  int sub(int num1, int num2);
  int mul(int num1, int num2);
  int div(int num1, int num2);

  public String stringAdd(String s1, String s2);

  default void defaultInfo(){
    System.out.println("This is a default method of interface");
    System.out.println("=====================================");
    System.out.println("This is a private method of interface");
    System.out.println(privateMethod(3,2));
    System.out.println(privateStaticMethod(3));
  }

  static int total(int[] array){
    int sum = 0;
    for (int i : array){
      sum += i;
    }
    System.out.println(privateStaticMethod(3));
    return sum;
  }

  private int privateMethod(int i, int j){
    return (i+j)*(i-j);
  }

  private static int privateStaticMethod(int i){
    return i*i;
  }



}
