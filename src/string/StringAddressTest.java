package string;

public class StringAddressTest {

  public static void main(String[] args) {
    String string = "a";
    String string2 = "a";
    String newString = new String("a");
//    System.out.println(string.hashCode());
//    System.out.println(newString.hashCode());
//    System.out.println((string+newString).hashCode());
    System.out.println(System.identityHashCode(string));
    System.out.println(System.identityHashCode(string2));
    System.out.println(System.identityHashCode(newString));
    System.out.println(System.identityHashCode(string+string2));
    System.out.println(System.identityHashCode("aa"));
    System.out.println(System.identityHashCode(string+string2));
    System.out.println((string+string2).hashCode());
    System.out.println((string+string2).hashCode());
    System.out.println((string+newString).hashCode());
  }

}
