package array;

import java.util.Arrays;

public class ArrayTest {

  public static void main(String[] args) {
    int[] arr = new int[10];
    int total = 0;

    for (int i = 0; i < arr.length; i++) {
      arr[i] = i + 1;
      total += arr[i];
      System.out.println(arr[i]);

    }
    System.out.println(Arrays.toString(arr));
    System.out.println(total);
    ;
  }
}
