import java.util.*;

abstract class uni {

  abstract void department_code();
  void uninameprint() {
    System.out.println("Indus university");
  }
}

class it extends uni {
  void department_code() {
    System.out.println("it_code is :- it2021");
  }
}

class cse extends uni {

  void department_code() {
    System.out.println("cse_code id :- cse2021");
  }
}

class E6_Anonymous_inner_class {

  public static void main(String args[]) {
    uni ob1 = new it();
    ob1.uninameprint();
    ob1.department_code();
    uni ob2 = new cse();
    ob2.uninameprint();
    ob2.department_code();
  }
}
