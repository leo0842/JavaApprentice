package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

class CustomOperator implements IntBinaryOperator {

  @Override
  public int applyAsInt(int left, int right) {
    if (Math.abs(left - 3) > Math.abs(right - 3)) {
      return right;
    } else {
      return left;
    }
  }
}

public class ReduceTest {

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    System.out.println(Arrays.stream(arr).filter(i -> i > 3).sum());
    System.out.println(Arrays.stream(arr).reduce(0, (i, j) -> i + j));
    System.out.println(Arrays.stream(arr).reduce(new CustomOperator()).getAsInt());

  }
}
