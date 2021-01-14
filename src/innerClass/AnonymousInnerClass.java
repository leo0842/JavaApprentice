package innerClass;

class Outer{
  int num=10;
  static int sNum = 11;

  Runnable getRunnable(int i){
    int num = 100;

    return new Runnable() {
      @Override
      public void run() {
        System.out.println(num);
        System.out.println(sNum);
        System.out.println(i);
      }
    };
  }
}

public class AnonymousInnerClass {

  public static void main(String[] args) {
    System.out.println(Outer.sNum);
    Outer outer = new Outer();
    System.out.println(outer.num);
    Runnable newRunnable = outer.getRunnable(1);
    newRunnable.run();

  }
}
