import java.util.*;

interface Shape2D {
  double getArea();
}

class Point3D {

  double x;
  double y;
  double z;

  public Point3D(double x, double y, double z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }
}

abstract class Shape {

  abstract void display();
}

class Circle extends Shape implements Shape2D {

  Point3D center;
  double radius;

  public Circle(Point3D center, double radius) {
    this.center = center;
    this.radius = radius;
  }

  public double getArea() {
    return 3.14 * radius * radius;
  }

  public void display() {
    System.out.println(
      "Circle with center (" +
      center.x +
      ", " +
      center.y +
      ", " +
      center.z +
      ") and radius " +
      radius
    );
  }
}

class p17_interface_class  {

  public static void main(String[] args) {
    Circle c = new Circle(new Point3D(0, 0, 0), 5);
    c.display();
    System.out.println("Area: " + c.getArea());
  }
}
