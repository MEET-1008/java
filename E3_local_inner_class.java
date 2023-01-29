import java.util.*;

class first {
  void display() {
    class marks {           // local inner class 
      void show() {
        System.out.println("marks is display...!");
      }
    }
    marks m1 = new marks();
    m1.show();
  }
}

class E3_local_inner_class {

  public static void main(String args[]) {
    first ob1 = new first();
    ob1.display();
  }
}
