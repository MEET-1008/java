import java.util.*;

class p8_find_arry_avg {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int i, j, sum = 0;

    int a[] = new int[3];
    int arrlength = a.length;

    for (i = 0; i < arrlength; i++) {
      System.out.printf("Enter the arry eliment ");
      a[i] = sc.nextInt();
    }

    for (i = 0; i < arrlength; i++) {
      sum = sum + a[i];
    }
    System.out.println("sum of arry : " + sum);
    System.out.println("avg of arry : " + sum / arrlength);
  }
}
