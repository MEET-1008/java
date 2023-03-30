import java.util.*;

public class p03_prime_number {

  public static void main(String[] args) {
    int i = 0;
    int flag = 0;
    Scanner input = new Scanner(System.in);
    System.out.printf("Enter the number :- ");
    int n = input.nextInt();
    int m = n / 2;
    if (n == 0 || n == 1) {
      System.out.println(n + " number is not prime...!");
    } else {
      for (i = 2; i <= m; i++) {
        if (n % i == 0) {
          System.out.println(n + " number is  prime...!");
          flag = 1;
          break;
        }
      }
      if (flag == 0) {
        System.out.println(n + " number is not prime...!");
      }
    }
  }
}
