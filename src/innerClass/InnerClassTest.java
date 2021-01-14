package innerClass;

import innerClass.OutClass.staticInClass;

class OutClass {

  private int num = 10;
  private static int staticNum = 20;
  private InClass inClass;

  public OutClass() {
    inClass = new InClass();
  }

  class InClass {

    int innerNum = 30;

    void test() {
      System.out.println(num);
      System.out.println(staticNum);
      System.out.println(innerNum);
    }

  }
  static class staticInClass{
    int inNum = 11;
    static int staticInNum = 111;

    void test(){
      System.out.println(inNum);
      System.out.println(staticInNum);
      System.out.println(staticNum);
    }
    static void test2(){

      System.out.println(staticInNum);
      System.out.println(staticNum);
    }
  }

  public void usingInner() {
    inClass.test();
  }
}

public class InnerClassTest {

  public static void main(String[] args) {

    OutClass outClass = new OutClass();

    outClass.usingInner();

    OutClass.InClass inClass = outClass.new InClass();
    inClass.test();
    System.out.println("==========================");
    OutClass.staticInClass staticInClass = new OutClass.staticInClass();
    staticInClass.test();
    OutClass.staticInClass.test2();
  }
}
