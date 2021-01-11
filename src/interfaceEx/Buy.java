package interfaceEx;

public interface Buy {
  void buy();
  int cost();
  default void order(){
    System.out.println("buy");
  }

}
