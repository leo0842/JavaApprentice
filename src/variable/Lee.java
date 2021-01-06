package variable;

import java.util.Scanner;

public class Lee {
  public static void main(String[] args) {
    int odd;


    Scanner scanner = new Scanner(System.in);
    odd = scanner.nextInt();
    if (odd%2==0) {
      System.out.println("짝수는 불가능합니다.");
    }
    else{

      for (int i = 1;i <= odd; i += 2){
        String ast="";
        for (int j = 1; j <= (odd-i)/2; j++){
          ast += " ";
        }
        for (int k = 1; k <= i; k++){
          ast += "*";
        }
        for (int j = 1; j <= (odd-i)/2; j++){
          ast += " ";
        }
        System.out.println((ast));
      }
    }

  }
}
