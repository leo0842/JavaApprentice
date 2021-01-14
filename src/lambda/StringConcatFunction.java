package lambda;

public class StringConcatFunction implements StringConcat{

  @Override
  public String stringConcat(String s1, String s2) {
    return s1+", "+s2;
  }
}
