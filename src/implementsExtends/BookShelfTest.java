package implementsExtends;

import java.util.ArrayList;

public class BookShelfTest {

  public static void main(String[] args) {
    BookShelf bookShelf = new BookShelf();

    bookShelf.enQueue("HarryPorter1");
    bookShelf.enQueue("HarryPorter2");
    bookShelf.enQueue("HarryPorter3");

    int n = bookShelf.queSize();

    for (int i=0; i < n; i++){
      System.out.println(bookShelf.deQueue());
    }

    System.out.println(bookShelf.bookCount());

  }


}
