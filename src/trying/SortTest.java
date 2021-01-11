package trying;

import java.io.IOException;

public class SortTest {

  public static void main(String[] args) throws IOException {
    Sort sort;
    System.out.println("B: Bubble, H: Heap, Q: Quick");
    int choice;
    choice = System.in.read();
    if (choice == 'B'){
      sort = new BubbleSort();
    }
    else if (choice == 'H'){
      sort = new HeapSort();
    }
    else {
      sort = new QuickSort();
    }

    System.out.println(sort.together());;
  }

}
