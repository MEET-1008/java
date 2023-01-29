import java.util.*;

class first {
  static class second {
    void show() {
      System.out.println("display the secound class method...!");
    }
  }
  void display (){
    System.out.println("display the first class method...!");

  }
}

class E4_static_inner_class {

  public static void main(String args[]) {
    first.second ob1 = new first.second();
    ob1.show();
    first ob2 = new first();
    ob2.display();

  }
}
