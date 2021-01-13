package collection;

import java.util.Comparator;
import java.util.TreeSet;

class Compare implements Comparator<String>{


  @Override
  public int compare(String o1, String o2) {
    return o1.compareTo(o2)*(-1);
  }
}
public class ComparatorTest {

  public static void main(String[] args) {

    TreeSet<String> treeSet = new TreeSet<String>(new Compare());
    treeSet.add("Kim");
    treeSet.add("Lee");
    treeSet.add("Park");
    System.out.println(treeSet);

  }

}
