package p18_all_class;

import java.util.*;

class employee {

  Scanner sc = new Scanner(System.in);

  String a, b;
  int c;

  public void input_data() {
    System.out.print("employee name :- ");
    a = sc.nextLine();
    System.out.print("employee gender (f/m) :- ");
    b = sc.nextLine();
    System.out.print("employee id :- ");
    c = sc.nextInt();
    System.out.println("\n");
  }

  public void show_data() {
    System.out.println("employee name :- " + a);
    System.out.println("employee gender :- " + b);
    System.out.println("employee id :- " + c);
  }
}

class salariedEmoloyee extends employee {

  double salary = 6000;
  double HRA, DA, total;

  void HRAF() {
    if (b.equals("f")) {
      HRA = 0.1 * salary;
    } else {
      HRA = 0.09 * salary;
    }
  }

  void DAF() {
    DA = 0.05 * salary;
  }

  void incriment() {
    salary = salary + 0.01 * salary;
  }

  void salarydisplay() {
    total = salary + DA + HRA;
    System.out.println("total salary of :-  " + total);
  }
}

class p18_package {

  public static void main(String[] args) {
    salariedEmoloyee Meet = new salariedEmoloyee();
    Meet.input_data();
    Meet.HRAF();
    Meet.DAF();
    Meet.show_data();
    Meet.salarydisplay();
  }
}
