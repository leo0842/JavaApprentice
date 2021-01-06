package variable;

public class ForExample {
  public static void main(String[] args) {
    int i;
    int j;
    for (i = 2; i < 10; i += 2){
      for (j = 2; j < 10; j+=2){
        if (i < j) break;
        System.out.println(i + "*" + j + "=" + i*j);
      }
    }
  }
}
