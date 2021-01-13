package collection;

import java.util.ArrayList;

class Stack {

  private ArrayList<String> arrayStack = new ArrayList<>();

  public ArrayList<String> getArrayStack() {
    return arrayStack;
  }

  public void push(String string) {
    arrayStack.add(string);

  }

  public String pop() {
    int len = arrayStack.size();

    if (len == 0) {
      return "empty array";
    } else {
      return arrayStack.remove(len - 1);
    }
  }
}

public class StackTest {

  public static void main(String[] args) {

    Stack stack = new Stack();
    stack.push("A");
    stack.push("B");
    stack.push("C");
    int len = stack.getArrayStack().size();
    for (int i=0; i<=len; i++){
      System.out.println(stack.pop());
    }
  }
}
