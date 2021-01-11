package implementsExtends;

import java.util.ArrayList;

public class Shelf {

  protected ArrayList<String> shelf;

  public Shelf() {
    shelf = new ArrayList<>();
  }

  public ArrayList<String> getShelf() {
    return shelf;
  }

  public int bookCount() {
    return shelf.size();
  }
}
