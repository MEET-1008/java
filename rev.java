import java.util.*;

class rev {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int n = arr.length;

    System.out.println("Enter the opertion :- ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int start = 0;
    for (int i = 0; i < n; i++) {
      if (arr[i] == a) {
        break;
      } else {
        start++;
      }
    }
    int end = 0;
    for (int i = 0; i < n; i++) {
      if (arr[i] == b) {
        break;
      } else {
        end++;
      }
    }

    
      for (int i = start; i < (start + end) / 2; i++) {
        for (int j = end; j < (start + end) / 2; j--) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    

    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
