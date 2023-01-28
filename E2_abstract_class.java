import java.util.*;

abstract class uni { // abstrace class
    abstract void printcode(); // abstrace method
}

class it extends uni {
  void printcode() {
    System.out.println("it code is :- it2021");
  }
}

class cs extends uni {
  void printcode() {
    System.out.println("cs code is :- cs2021");
  }
}

class E2_abstract_class {

  public static void main(String args[]) {
    uni ob1 = new it();
    ob1.printcode();
    uni ob2 = new cs();
    ob2.printcode();
  }
}
