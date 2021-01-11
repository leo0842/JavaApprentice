package template;

public abstract class Car {

  public abstract void drive();

  public abstract void stop();

  public void turnOn() {
    System.out.println("HI!");
  }

  public void turnOff() {
    System.out.println("BYE!");
  }

  final public void run(){
    turnOn();
    drive();
    stop();
    turnOff();
  }

}
