package string;

public class BufferBuilderTest {

  public static void main(String[] args) {
    StringBuilder buffer = new StringBuilder();
    buffer.append("java");
    System.out.println(System.identityHashCode(buffer));
    buffer.append("android");
    System.out.println(System.identityHashCode(buffer));
    String string = buffer.toString();
    System.out.println(System.identityHashCode(buffer));
    System.out.println(System.identityHashCode(string));
    

  }

}
