package polymorphism;

import java.util.ArrayList;

class Animal {

  public void me() {
    System.out.println("Animal");
  }
}

class Human extends Animal {

  public void me() {
    System.out.println("Animal");
  }
}
class Tiger extends Animal {

  @Override
  public void me() {
    System.out.println("Tiger");
  }
}

class Eagle extends Animal {

  @Override
  public void me() {
    System.out.println("Eagle");
  }
}

public class AnimalTest {
  public void shout(Animal animal) {
    animal.me();
  }
  public static void main(String[] args) {
    Animal hAnimal = new Human();
    Animal tAnimal = new Tiger();
    Animal eAnimal = new Eagle();

    AnimalTest animalTest = new AnimalTest();

    animalTest.shout(hAnimal);
    animalTest.shout(tAnimal);
    animalTest.shout(eAnimal);

    ArrayList<Animal> animalArrayList = new ArrayList<>();

    animalArrayList.add(hAnimal);
    animalArrayList.add(tAnimal);
    animalArrayList.add(eAnimal);

    for (Animal animal : animalArrayList){
      animal.me();
    }
  }
}
