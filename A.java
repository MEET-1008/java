import java.util.*;

public class A {

  public static void main(String s1[]) {
    int n;
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    for (int i = 1; i <= 10; i++) {
        int b = n*i;
      System.out.println(n + " x "+ i + " = "+ b);
    }
  }
}
