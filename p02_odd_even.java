import java.util.*;

class p02_odd_even {

  public static void main(String[] args) {
    int a;
    Scanner input = new Scanner(System.in);
    System.out.printf("enter the your number :- ");
    a = input.nextInt();
    if (a % 2 == 0) {
      System.out.println(a + " number is even...!");
    }
    else{
        System.out.println(a +" number is odd...!");
    }
  }
}
