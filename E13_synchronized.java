import java.io.*;
class Test {
  synchronized void test_function(int n) {
    for (int i = 1; i <= 3; i++) { // synchronized method
      System.out.println(n + i);
      try {} catch (Exception e) {}
    }
  }
}

public class E13_synchronized {
  public static void main(String args[]) {
    Test obj = new Test();
    Thread a = new Thread() {
      public void run() {
        obj.test_function(15);
      }    };
    Thread b = new Thread() {
      public void run() {
        obj.test_function(30);
      }   };
    a.start();   b.start();
  }
}
