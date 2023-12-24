import java.util.ArrayList;
import java.util.Scanner;

public class InteractiveTest {
  public static void main(String[] args) {
    ArrayList<String> valid = new ArrayList<>();
    valid.add("add");
    valid.add("subtract");
    valid.add("multiply");
    valid.add("divide");
    valid.add("exponential");
    valid.add("root");
    valid.add("trig");
    valid.add("absolute value");
    valid.add("factorial");
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
        System.out.print("First value: ");
      }
      double a = console.nextDouble();
      
      // OPERATOR
      System.out.print("Operator ("+valid+"): ");
      String op = console.next();
      // handles invalid inputs
      while (!valid.contains(op)) {
        System.out.println("Please input a valid operator.");
        System.out.print("Operator ("+valid+"): ");
        op = console.next();
      }

      // SECOND VALUE
      System.out.print("Second value: ");
      // handles invalid inputs
      while (!console.hasNextDouble()) {
        System.out.println("Please input a number.");
        System.out.print("Second value: ");
      }
      double b = console.nextDouble();

      main.calculate(a, b, op);
      System.out.print("Continue? (Y/N): ");
      if (console.next().toLowerCase().equals("n")) {
        cont = false;
      }
    }
    console.close();
  }
}
