package generic;

public class GenericTest {

  public static void main(String[] args) {
    Material<Powder> powderMaterial = new Material<>();
    Material<Plastic> plasticMaterial = new Material<>();
//    Material<Water> waterMaterial = new Material<Water>(); 불가능

    Powder powder = new Powder();
    Plastic plastic = new Plastic();
    powderMaterial.setMaterial(powder);
    System.out.println(powderMaterial);
    plasticMaterial.setMaterial(plastic);
    System.out.println(plasticMaterial);
    powderMaterial.doPrinting();
    plasticMaterial.doPrinting();
  }
}
