package template;

public class ManualCar extends Car{

  @Override
  public void drive() {
    System.out.println("Man driving");
  }

  @Override
  public void stop() {
    System.out.println("Man stopping");
  }
}
