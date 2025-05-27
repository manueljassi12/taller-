import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

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
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        try (Scanner scanner = new Scanner(System.in)) {
            double num1, num2;
            String operation;

            try {
                System.out.print("Enter the first number: ");
                num1 = scanner.nextDouble();

                System.out.print("Enter an operation (+, -, *, /): ");
                operation = scanner.next();

                System.out.print("Enter the second number: ");
                num2 = scanner.nextDouble();

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter numbers only.");
                return;
            }

            double result;
            switch (operation) {
                case "+":
                    result = calculator.add(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case "-":
                    result = calculator.subtract(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case "*":
                    result = calculator.multiply(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case "/":
                    try {
                        result = calculator.divide(num1, num2);
                        System.out.println("Result: " + result);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Invalid operation.");
            }
        }
    }
}
