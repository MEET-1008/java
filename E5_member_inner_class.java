import java.util.*;

class first {
  class second {
    void show() {
      System.out.println("display the secound class method...!");
    }
  }
}

class E5_member_inner_class {

  public static void main(String args[]) {
    first ob1 = new first();
    first.second ob2 = ob1.new second();
    ob2.show();
  }
}
