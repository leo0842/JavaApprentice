package downcasting;

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
  public void reading() {
    System.out.println("Human reading");
  }
}

class Tiger extends Animal {

  @Override
  public void me() {
    System.out.println("Tiger");
  }
  public void hunting() {
    System.out.println("Tiger hunting");
  }
}

class Eagle extends Animal {

  @Override
  public void me() {
    System.out.println("Eagle");
  }
  public void flying() {
    System.out.println("Eagle flying");
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
    // 다형성 예제
    AnimalTest animalTest = new AnimalTest();
    if (hAnimal instanceof Human) {
      Human hAnimal2 = (Human) hAnimal;
      hAnimal2.reading();
    }
    animalTest.shout(hAnimal);
    animalTest.shout(tAnimal);
    animalTest.shout(eAnimal);
    // 오버라이딩 예제
    ArrayList<Animal> animalArrayList = new ArrayList<>();

    animalArrayList.add(hAnimal);
    animalArrayList.add(tAnimal);
    animalArrayList.add(eAnimal);

    for (Animal animal : animalArrayList){
      animal.me();
    }


    AnimalTest test = new AnimalTest();
    test.testDownCasting(animalArrayList);
    System.out.println("!!!");
  }
  public void testDownCasting (ArrayList<Animal> list) {
    for (int i=0; i<list.size(); i++){
      Animal animal3 = list.get(i);
      if (animal3 instanceof Human){
        Human human = (Human) animal3;
        human.reading();
      }
      else if (animal3 instanceof Tiger) {
        Tiger tiger = (Tiger) animal3;
        tiger.hunting();
      }
      else if (animal3 instanceof Eagle){
        Eagle eagle = (Eagle) animal3;
        eagle.flying();
      }
      else{
        System.out.println("error");
      }
    }
  }
}
