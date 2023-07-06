import java.util.List;

public interface Calculator {

    Double calculate(double num1, double num2, String type);

    List<String> getHistory(int farBack);
}