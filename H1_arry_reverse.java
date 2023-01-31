import java.util.*;

class H1_arry_reverse {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int n = arr.length;

    System.out.println("Enter the opertion :- ");
    int a = sc.nextInt();
    int b = sc.nextInt();

    int arr2[] = new int[10];

   
    for (int i = a; i <= b; i++) {
      arr2[i] = arr[i];
     
    }

    int start = 0;
    for (int i = 0; i < n; i++) {
      if (arr[i] == a) {
        break;
      } else {
        start++;
      }
    }

    for (int i = 9; i >= start ; i--) {
     System.out.print( arr2[i] + " "); 
     
    }

  }
}
