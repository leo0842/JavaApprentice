package collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListTest {

  public static void main(String[] args) {
    ArrayList<String> arrayList = new ArrayList<>();
    arrayList.add("A");
    arrayList.add("B");
    arrayList.add("C");
    arrayList.add(1, "D");
    arrayList.remove(arrayList.size()-1);
    System.out.println(arrayList);
    arrayList.add(1, "D");
    LinkedList<String> linkedList = new LinkedList<>();
    linkedList.add("A");
    linkedList.add("B");
    linkedList.add("C");
    linkedList.add(1, "D");
    linkedList.removeLast();
    System.out.println(linkedList);
  }

}
