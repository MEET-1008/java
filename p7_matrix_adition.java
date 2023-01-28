import java.util.*;

class p7_matrix_adition {

  public static void main(String args[]) {
    int row = 2, colum = 2, i, j;

    int a[][] = new int[row][colum];
    int b[][] = new int[row][colum];
    int c[][] = new int[row][colum];
    Scanner sc = new Scanner(System.in);

    // first arry input for user
    System.out.println("     Enter the first arry eliment    ");
    for (i = 0; i < row; i++) {
      for (j = 0; j < colum; j++) {
        System.out.printf("enter the eliment: ");
        a[i][j] = sc.nextInt();
      }
    }

    // scound arry input in usre
    System.out.println("     Enter the scound arry eliment    ");
    for (i = 0; i < row; i++) {
      for (j = 0; j < colum; j++) {
        System.out.printf("Enter the eliment : ");
        b[i][j] = sc.nextInt();
      }
    }

    // sum of tow arry eliment
    for (i = 0; i < row; i++) {
      for (j = 0; j < colum; j++) {
        c[i][j] = a[i][j] + b[i][j];
      }
    }

    // print the sum of arry
    System.out.println("Sum of two arry :- ");
    for (i = 0; i < row; i++) {
      for (j = 0; j < colum; j++) {
        System.out.printf(c[i][j] + "\t");
      }
      System.out.println();
    }
  }
}
