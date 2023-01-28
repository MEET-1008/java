import java.util.*;

class sub_code {

  static int it_code = 2141220; // static variable

  static void itcodeprint() { // static method
    System.out.println("id sub code is :- " + it_code);
  }

  static { // static block
    System.out.println("this is a static bolck ");
  }
}

public class E1_static_keyword {

  public static void main(String args[]) {
    sub_code it = new sub_code();
    it.itcodeprint();
  }
}
