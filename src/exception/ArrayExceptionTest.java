package exception;

public class ArrayExceptionTest {

  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};
    try{
      for (int i=0; i<arr.length+1;i++){
        System.out.println(arr[i]);
      }
    }
    catch (Exception e) {
      System.out.println(e.getMessage());
      System.out.println(e.toString());
      System.out.println("HI");
    }


  }

}
