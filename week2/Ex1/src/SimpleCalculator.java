import java.util.Scanner;

class Calculator {
    public double add(double a, double b) {
        return a + b;
    }
    public double subtract(double a, double b) {
        return a - b;
    }
    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero.");
        }
        return a / b;
    }
}

public class SimpleCalculator {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java SimpleCalculator <first number> <operator> <second number>");
            return;
        }

        double firstNumber = Double.parseDouble(args[0]);
        String operator = args[1];
        double secondNumber = Double.parseDouble(args[2]);

        Calculator calculator = new Calculator();
        double result = 0;

        switch (operator) {
            case "+":
                result = calculator.add(firstNumber, secondNumber);
                break;
            case "-":
                result = calculator.subtract(firstNumber, secondNumber);
                break;
            case "*":
                result = calculator.multiply(firstNumber, secondNumber);
                break;
            case "/":
                try {
                    result = calculator.divide(firstNumber, secondNumber);
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator.");
                return;
        }

        System.out.printf("Result: %.2f %s %.2f = %.2f%n", firstNumber, operator, secondNumber, result);
    }
}
