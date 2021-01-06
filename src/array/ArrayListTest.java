package array;

import java.util.ArrayList;
import java.util.Stack;

public class ArrayListTest {

  public static void main(String[] args) {

    ArrayList<String> list = new ArrayList<String>();
    list.add("aaa");
    list.add("bbb");
    list.add("ccc");

    for (String list1 : list) {
      System.out.println(list1);

    }
    System.out.println("===");
    for (int i=0; i < list.size(); i++){
      String str = list.get(i);
      System.out.println(str);
    }
  }

}
