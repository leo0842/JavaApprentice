package interfaceEx;

public class CompleteCalc extends Calculator {

  @Override
  public int mul(int num1, int num2) {
    return num1 * num2;
  }

  @Override
  public int div(int num1, int num2) {
    if (num2 == 0) {
      return ERROR;
    } else {
      return num1 / num2;
    }
  }

  @Override
  public String stringAdd(String s1, String s2) {
    return s1 + s2;
  }

  public void showInfo(){
    System.out.println("Completed");
  }

}
