package trying;

public class BubbleSort implements Sort{

  @Override
  public void ascending() {
    System.out.println("BubbleSort ascending");
  }

  @Override
  public void descending() {
    System.out.println("BubbleSort descending");
  }

  @Override
  public String description() {
    return "BubbleSort";
  }
}
