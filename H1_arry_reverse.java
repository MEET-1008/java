import java.util.*;

class reverseArray {

  void reverse(int a[], int n) {
    int[] b = new int[n];
    int j = n;
    for (int i = 0; i < n; i++) {
      b[j - 1] = a[i];
      j = j - 1;
    }
    // printing the reversed array
    System.out.printf("Reversed array is:");
    for (int k = 0; k < n; k++) {
      System.out.printf(b[k] + " ");
    }
  }
}

class H1_arry_reverse {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int n = arr.length;

    System.out.println("Enter the opertion :- ");
    int a = sc.nextInt();
    int b = sc.nextInt();

    int arr2[] = new int[n];
    int count=0;

    for (int i = a; i <= b; i++) {
      arr2[i] = arr[i];
      count++;
    }
    System.out.println(arr2.length);
    System.out.println(count);
    reverseArray ob1 = new reverseArray();
    ob1.reverse(arr2, arr2.length);
  }
}
