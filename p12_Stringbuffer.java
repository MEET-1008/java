import java.util.*;

public class p12_Stringbuffer {

  public static void main(String[] args) {
    StringBuffer sc = new StringBuffer("indus");
    sc.append("university");
    System.out.println("append: " + sc);
    sc.delete(1, 4);
    System.out.println(" delete: " + sc);
    sc.reverse();
    System.out.println("revers: " + sc);
    System.out.println("capacity: " + sc.capacity());
    sc.ensureCapacity(40);
    System.out.println("capacity: " + sc.capacity());
  }
}
