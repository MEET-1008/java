import java.util.*;

abstract class shape {

  public abstract void area();

  Scanner sc = new Scanner(System.in);
}

class circle extends shape {

  double PI = 3.14;

  public void area() {
    System.out.print("Enter the R :- ");
    int R = sc.nextInt();
    System.out.println("area of circle :- " + R * PI + "\n");
  }
}

class Triangle extends shape {

  public void area() {
    System.out.print("Enter the B :- ");
    int b = sc.nextInt();
    System.out.print("Enter the H :- ");
    int h = sc.nextInt();
    System.out.println("area of Triangle :- " + (b * h) / 2 + "\n");
  }
}

class Square extends shape {

  public void area() {
    System.out.print("Enter the X :- ");
    int x = sc.nextInt();
    System.out.println("area of Triangle :- " + x * x + "\n");
  }
}

class p16_abstract_class {

  public static void main(String args[]) {
    shape ob1 = new circle();
    ob1.area();
    shape ob2 = new Triangle();
    ob2.area();
    shape ob3 = new Square();
    ob3.area();
  }
}
