package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Field;

public class InputExceptionTest {

  public static void main(String[] args) {

    // 첫 번째 방법
    FileInputStream fileInputStream = null;
    try {
      fileInputStream  = new FileInputStream("a.txt");
    } catch (FileNotFoundException e) {
      System.out.println(e);
      System.out.println("HI");
    }finally {
      try {
        fileInputStream.close();
      } catch (IOException e) {
        System.out.println(e);
        System.out.println("IOException");
      }
      catch (NullPointerException e){
        System.out.println(e);
        System.out.println("NullPointerException");
      }
    }
    System.out.println("finish");
    //두 번째 방법. 자동으로 close가 됨(AutoClosable)
    try(FileInputStream fileInputStream2 = new FileInputStream("a.txt")){

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }




}
