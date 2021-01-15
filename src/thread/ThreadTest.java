package thread;

class MyThread extends Thread{

  @Override
  public void run() {
    for (int i=0;i<20;i++){
      System.out.println(i);
      try {
        sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
public class ThreadTest {

  public static void main(String[] args) {

    System.out.println("start");
    MyThread thread1 = new MyThread();
    MyThread thread2 = new MyThread();

    thread1.start();
    thread2.start();
    System.out.println("end");

  }
}
