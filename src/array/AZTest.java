package array;

public class AZTest {

  public static void main(String[] args) {

    char[] cArr = new char[26];

    for (int i = 65; i <= (int)'Z'; i++){
      cArr[i-65] = (char)i;
    }
    System.out.println(cArr);
  }

}
