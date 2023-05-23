import java.util.*;                 // using Implement Runnable 
class A implements Runnable {
  public void run() {
    try {
      for (int i = 1; i <= 5; i++) {
        System.out.println("meet");
        Thread.sleep(1000);
      }
    } catch (Exception e) {}
  }
}

class E12_2_thread {
  public static void main(String args[]) throws Exception {
    A T = new A();
    Thread T1 = new Thread(T);
    T1.start();

    for (int i = 1; i <= 5; i++) {
      System.out.println("vaghasiya");
      Thread.sleep(1000);
    }
  }
}
