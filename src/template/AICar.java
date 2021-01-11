package template;

public class AICar extends Car{

  @Override
  public void drive() {
    System.out.println("AI driving");
  }

  @Override
  public void stop() {
    System.out.println("AI stopping ");
  }
}
