import java.util.*;

class print_emp_list {

  print_emp_list(int a, String b, String c, int d) {
    int HRA = (10 * d) / 100;
    int DA = (25 * d) / 100;
    int Total_pay = HRA + DA + d;

    System.out.println("employee code :- " + a);
    System.out.println("employee name :- " + b);
    System.out.println("employee designation :- " + c);
    System.out.println("Basic pay is :- " + d);
    System.out.println("HRA pay :- " + HRA);
    System.out.println("DA pay :- " + DA);
    System.out.println("total pay :- " + Total_pay + "\n");
  }
}

class p13_calcuiate_HRA_DA_PAY {

  public static void main(String[] args) {
    print_emp_list Meet = new print_emp_list(20231520, "kanu", "web developer", 60550);
    print_emp_list Nirav = new print_emp_list(20231521, "manu", "DBA", 55890);
    print_emp_list Jay = new print_emp_list(20231522, "raju", "graphic designer", 50980);
  }
}
