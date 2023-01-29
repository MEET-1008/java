import java.util.*;

class p10_sort_string_alphabeticalorder {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.printf("Enter the your string :- ");
    String inputstr = sc.nextLine();
    char chararry[] = inputstr.toCharArray();
    int n = chararry.length;
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (chararry[i] > chararry[j]) {
          char temp = chararry[i];
          chararry[i] = chararry[j];
          chararry[j] = (char) temp;
        }
      }
    }
    System.out.printf(Arrays.toString(chararry));
  }
}
