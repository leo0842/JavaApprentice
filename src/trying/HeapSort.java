package trying;

public class HeapSort implements Sort{

  @Override
  public void ascending() {
    System.out.println("HeapSort ascending");
  }

  @Override
  public void descending() {
    System.out.println("HeapSort descending");
  }

  @Override
  public String description() {
    return "HeapSort";
  }
}
