package interfaceEx;

public interface Sell {

  void sell();

  int cost();

  default void order() {
    System.out.println("sell");
  }

  static void ad(){
    System.out.println("Good item");
  }

}
