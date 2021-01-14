package stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ArrayListTest {

  public static void main(String[] args) {
    ArrayList<String> arrayList = new ArrayList<>();
    arrayList.add("overwhelm");
    arrayList.add("instructor");
    arrayList.add("blow");
    arrayList.add("blockade");
    arrayList.add("clench");

    Stream<String> stringStream = arrayList.stream();
    stringStream.filter(s -> s.length()>5).forEach(s -> System.out.print(s +" "));
    System.out.println("\n");
//    stringStream.sorted().forEach(System.out::print); Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
    arrayList.stream().sorted().forEach(s -> System.out.print(s + " "));
    System.out.println("\n");
    arrayList.stream().map(s -> s.length()).forEach(System.out::println);

  }

}
