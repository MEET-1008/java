import java.util.*;

class person {

  int agg;
  int salary;
  String name;

  person() {
    Scanner sc = new Scanner(System.in);
    System.out.printf("Enter the your name :- ");
    name = sc.nextLine();
    System.out.printf("Enter the your agg :- ");
    agg = sc.nextInt();
    System.out.printf("Enter the your salary :-");
    salary = sc.nextInt();
    System.out.println(" \n" + "name is : " + name);
    System.out.println(name + " agg is " + agg);
    System.out.println(name + " salary is " + salary);
  }

  person(String name, int agg, int salary) {
    this.name = name;
    this.agg = agg;
    this.salary = salary;
    System.out.println("name is : " + name);
    System.out.println(name + " agg is " + agg);
    System.out.println(name + " salary is " + salary + "\n");
  }
}

class p11_constructor {

  public static void main(String args[]) {
    person meet = new person("raju", 23, 23000);
    person ob2 = new person();
  }
}
