package interfaceEx;

public class CalcTest {

  public static void main(String[] args) {
    int n1 = 10;
    int n2 = 3;
    CompleteCalc calculator = new CompleteCalc();
    System.out.println((calculator.add(n1, n2)));;
    System.out.println((calculator.sub(n1, n2)));
    System.out.println((calculator.mul(n1, n2)));
    System.out.println((calculator.div(n1, n2)));
    calculator.showInfo();
    calculator.defaultInfo();
    int[] array = {1,2,3,4,5};
    System.out.println(Calc.total(array));

  }

}
