import java.util.*;

public class p19_CommandLineArguments {

  public static void main(String[] args) {
    try {
      switch (args.length) {
        case 1 -> throw new IllegalArgumentException(
          "Please enter two command line arguments."
        );
        case 2 -> {
          int num1 = Integer.parseInt(args[0]);
          int num2 = Integer.parseInt(args[1]);
          if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
          }
          int result = num1 / num2;
          System.out.println("Result: " + result);
        }
        default -> throw new IllegalArgumentException(
          "Please enter only two command line arguments."
        );
      }
    } catch (NumberFormatException e) {
      System.out.println(
        "Invalid command line argument. Please enter a number."
      );
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    } catch (ArithmeticException e) {
      System.out.println(e.getMessage());
    }
  }
}
