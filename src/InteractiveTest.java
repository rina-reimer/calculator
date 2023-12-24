import java.util.*;

public class InteractiveTest {
  public static void main(String[] args) {
    String[] valid = {"add", "subtract", "multiply", "divide", "exponential", "root", 
                      "trig", "absolute value", "factorial"};
    ScientificCalculator main = new ScientificCalculator();
    Scanner console = new Scanner(System.in);

    System.out.println("Hello! Welcome to my calculator");
    boolean cont = true;

    while (cont) {
      // FIRST VALUE
      System.out.print("First value: ");
      // handles invalid inputs
      while (!console.hasNextDouble()) {
        System.out.println("Please input a number.");
        System.out.print("Value: ");
      }
      double a = console.nextDouble();
      
      // OPERATOR
      System.out.print("Operator ("+valid+"): ");
      String op = console.next();
      // handles invalid inputs
      while (!contains(valid, op)) {
        System.out.println("Please input a valid operator.");
        System.out.print("Operator ("+valid+"): ");
        op = console.next();
      }
      
      // SECOND VALUE
      double b;
      if (op.equals("add")) {
        System.out.print("Additive: ");
        // handles invalid inputs
        while (!console.hasNextDouble()) {
          System.out.println("Please input a number.");
          System.out.print("Additive: ");
        }
        b = console.nextDouble();
      } else if (op.equals("subtract")) {
          System.out.print("Subtractive: ");
          // handles invalid inputs
          while (!console.hasNextDouble()) {
            System.out.println("Please input a number.");
            System.out.print("Subtractive: ");
          }
      } else if (op.equals("multiply")) {
        System.out.print("Multiplicant: ");
        // handles invalid inputs
        while (!console.hasNextDouble()) {
          System.out.println("Please input a number.");
          System.out.print("Multiplicant: ");
        }
      } else if (op.equals("divide")) {
        System.out.print("Divisor: ");
        // handles invalid inputs
        while (!console.hasNextDouble()) {
          System.out.println("Please input a number.");
          System.out.print("Divisor: ");
        }
      } else if (op.equals("exponential")) {
        System.out.print("Power: ");
        // handles invalid inputs
        while (!console.hasNextDouble()) {
          System.out.println("Please input a number.");
          System.out.print("Power: ");
        }
      } else if (op.equals("root")) {
        System.out.print("Power: ");
        // handles invalid inputs
        while (!console.hasNextDouble()) {
          System.out.println("Please input a number.");
          System.out.print("Power: ");
        }
      } else if (op.equals("trig")) {
        String[] trigFunctions = {"sine", "cosine", "tangent", 
                                "secant", "cosecant", "cotangent"};
        System.out.print("Function "+trigFunctions+": ");
        op = console.next();
        while (!contains(trigFunctions, op)) {
          System.out.println("Please input a valid operator.");
          System.out.print("Function "+trigFunctions+": ");
          op = console.next();
        }
        b = java.util.Arrays.asList(trigFunctions).indexOf(op);
      } else if (op.equals("absolute value")) {
        b=0;
      } else if (op.equals("factorial")) {
        b=0;
      }

      main.calculate(a, b, op);
      System.out.print("Continue? (Y/N): ");
      if (console.next().toLowerCase().equals("n")) {
        cont = false;
      }
    }
    console.close();
  }

  // simple linear search O(n)
  private static boolean contains(String[] list, String value) {
    for (String s : list) {
      if (s.equals(value)) {
        return true;
      }
    }
    return false;
  }
}
