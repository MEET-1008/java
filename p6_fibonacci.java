import java.util.*;

 class p6_fibonacci {

  public static void main(String[] args) {
    int n1 = 0;
    int n2 = 1;
    int n3;
    System.out.printf("Enter a number :- ");
    Scanner s1 = new Scanner(System.in);
    int count = s1.nextInt();
    System.out.printf(n1 + "" + "");
    for (int i = 2; i < count; i++) {
      n3 = n1 + n2;
      System.out.printf(" " + n3);
      n1 = n2;
      n2 = n3;
    }
  }
}
