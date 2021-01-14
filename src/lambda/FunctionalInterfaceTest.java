package lambda;

public class FunctionalInterfaceTest {

  public static void main(String[] args) {
    FunctionalInterfaceNumber max = (x, y) -> (x>=y)?x:y;
    System.out.println(max.getMaxNumber(10, 11));
    //lambda
    StringConcat stringConcat = (s1, s2) -> s1 + ", " + s2;
    System.out.println(stringConcat.stringConcat("Kim", "Lee"));

    //class
    StringConcatFunction stringConcatFunction = new StringConcatFunction();
    System.out.println(stringConcatFunction.stringConcat("Kim", "Lee"));
  }
}
