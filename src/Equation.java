package src;

import java.util.HashMap;
import java.util.Map;
import java.lang.Math;

public class Equation {
    private Double a;
    private Double b;
    private Double result;
    private String operation;
    private Map<String, String> validOperations;

    public Equation(double a, double b, String type) {
        validOperations = new HashMap<>();
        validOperations.put("add", " + ");
        validOperations.put("subtract", " - ");
        validOperations.put("multiply", " * ");
        validOperations.put("divide", " / ");
        validOperations.put("exponential", " ^ ");
        validOperations.put("root", " √ ");
        validOperations.put("trig", " ????? ");
        validOperations.put("absolute value", "||");
        validOperations.put("factorial", "! ");

        if (!validOperations.keySet().contains(type.toLowerCase())) {
            throw new NullPointerException("Invalid operation: " + type);
        }

        this.a = a;
        this.b = b;
        this.operation = type;
        this.result = calculate(a, b, type);
    }
    
    private Double calculate(double a, double b, String op) {
        if (op.equals("add")) {
            return (double)a + b;
        } else if (op.equals("subtract")) {
            return (double)a - b;
        } else if (op.equals("multiply")) {
            return (double)a * b;
        } else if (op.equals("divide")) {
            return (double)a / b;
        } else if (op.equals("exponential")) {
            return Math.pow(a, b);
        } else if (op.equals("root")) {
            return Math.pow(b, 1/a);
        } else if (op.equals("trig")) {
            return trigFunction(a, (int)b);
        } else if (op.equals("absolute value")) {
            return Math.abs(a);
        } else if (op.equals("factorial")) {
            int num = 1;
            for (int i = 1; i < a; i++) { 
                num *= i;
            }
            return (double)num;
        }
        return null;
    }

    private Double trigFunction(double num, int type) {
        /* LEGEND
        0 - sine
        1 - cosine
        2 - tangent
        3 - secant
        4 - cosecant
        5 - cotangent
         */
        if (type == 0) {
            validOperations.put("trig", "sin(");
            return Math.sin(num);
        } else if (type == 1) {
            validOperations.put("trig", "cos(");
            return Math.cos(num);
        } else if (type == 2) {
            validOperations.put("trig", "tan(");
            return Math.tan(num);
        } else if (type == 3) {
            validOperations.put("trig", "sec(");
            return 1/Math.cos(num);
        } else if (type == 4) {
            validOperations.put("trig", "csc(");
            return 1/Math.sin(num);
        } else if (type == 5) {
            validOperations.put("trig", "cot(");
            return 1/Math.tan(num);
        }
        return null;
    }

    public Double getResult() {
        return result;
    }

    public String toString() {
        if (operation.equals("exponential")) {
            return b + validOperations.get(operation) + a + " = " + result;
        } else if (operation.equals("trig")) {
            return validOperations.get("trig") + a + ") = " + result;
        } else if (operation.equals("absolute value")) {
            return "|" + a + "| = " + result;
        } else if (operation.equals("exponential")) {
            return a + validOperations.get(operation) + "= " + result;
        }
        return a + validOperations.get(operation) + b + " = " + result;
    }
}
