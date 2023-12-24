import java.util.ArrayList;
import java.util.List;

public class ScientificCalculator implements Calculator {
    private List<Equation> history;

    public ScientificCalculator() {
        this.history = new ArrayList<>();
    }

    public Double calculate(double a, double b, String type) {
        Equation eq = new Equation(a, b, type);
        history.add(eq);
        System.out.println(eq);
        return eq.getResult();
    }
        
    public void getHistory(int length) { 
        List<String> result = new ArrayList<>(length);
        int endIndex = history.size() - length - 1;
        if (endIndex < 0) {
            endIndex = 0;
        }
        result.add(history.get(history.size()-1).toString());
        for (int i = history.size()-2; i > endIndex; i--) {
            result.add("\n"+history.get(i).toString());
        }
        System.out.println(result);
    }



    /*Integer returnPi(int digits);

    Integer exponentialInteger(int a, int b, boolean basic);

    Integer rootInteger(int num, int n, boolean basic);

    Integer trig(int num, String type);*/
}
