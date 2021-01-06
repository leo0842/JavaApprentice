package array;

import java.util.Arrays;

public class BookTest {

  public static void main(String[] args) {

    Book[] arr1 = new Book[5];

    for (int i = 0; i < arr1.length; i++) {
      arr1[i] = new Book(i, "태백산맥");
    }
    for (Book book : arr1) {
      book.showBookInfo();
    }
  }
}
