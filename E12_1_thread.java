import java.util.*;            // using by Extends Thread 

class A extends Thread {

  public void run() {
    try {
      for (int i = 1; i <= 5; i++) {
        System.out.println("meet");
        Thread.sleep(1000);
      }
    } 
    catch (Exception e) { }
  }
}

class E12_1_thread {

  public static void main(String args[]) throws Exception {
    A T = new A();
    T.start();

    for (int i = 1; i <= 5; i++) {
      System.out.println("vaghasiya");
      Thread.sleep(1000);
    }
  }
}
