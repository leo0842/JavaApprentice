package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

  public static void main(String[] args) {
    HashSet<Integer> hashSet = new HashSet<>();
    hashSet.add(1);
    hashSet.add(4);
    hashSet.add(3);
    hashSet.add(1);
    System.out.println(hashSet);

    Iterator<Integer> ir = hashSet.iterator();

    while (ir.hasNext()) {
      int n = ir.next();
      System.out.println(n);
    }

    //enhanced for
    for (int n : hashSet) {
      System.out.println(n);
    }

  }

}

