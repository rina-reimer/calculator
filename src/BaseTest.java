public abstract class BaseTest {

    public static void main(String[] args) {
        ScientificCalculator main = new ScientificCalculator();
        System.out.println("Hello! Welcome to my calculator");

        System.out.println("ADDITION TEST:");
        main.calculate(3, 2, "add");

        System.out.println("SUBTRACTION TEST:");
        main.calculate(3, 2, "subtract");
        main.getHistory(1);

        System.out.println("MULTIPLICATION TEST:");
        main.calculate(3, 2, "multiply");

        System.out.println("DIVISION TEST:");
        main.calculate(3, 2, "divide");

        System.out.println("EXPONENTIAL TEST:");
        main.calculate(3, 2, "exponential");

        System.out.println("ROOT TEST:");
        main.calculate(8, 2, "root");

        System.out.println("TRIG TEST:");
        main.calculate(45, 1, "trig");

        System.out.println("ABSOLUTE VALUE TEST:");
        main.calculate(-3, 0, "absolute value");

        System.out.println("FACTORIAL TEST:");
        main.calculate(3, 0, "factorial");

        System.out.println("HISTORY:");
        main.getHistory(5);
    }
}