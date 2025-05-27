import java.util.InputMismatchException;
import java.util.Scanner;

public class ShapeCalculator {

    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static double calculateSquareArea(double side) {
        return side * side;
    }

    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double calculateTrapezoidArea(double base1, double base2, double height) {
        return 0.5 * (base1 + base2) * height;
    }

    public static double calculatePentagonArea(double side) {
        return (0.25 * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * side * side);
    }

    public static double calculateHexagonArea(double side) {
        return ((3 * Math.sqrt(3)) / 2) * side * side;
    }

    public static double calculateRhombusArea(double diagonal1, double diagonal2) {
        return 0.5 * diagonal1 * diagonal2;
    }

    private static double getPositiveDoubleInput(Scanner scanner, String prompt) {
        double value;
        while (true) {
            System.out.print(prompt);
            try {
                value = scanner.nextDouble();
                if (value > 0) {
                    scanner.nextLine(); // Consume newline
                    return value;
                } else {
                    System.out.println("Invalid input. Please enter a positive number.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Consume the invalid input
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int choice;
            do {
                System.out.println("\nShape Area Calculator");
                System.out.println("---------------------");
                System.out.println("1. Calculate Triangle Area");
                System.out.println("2. Calculate Square Area");
                System.out.println("3. Calculate Rectangle Area");
                System.out.println("4. Calculate Circle Area");
                System.out.println("5. Calculate Trapezoid Area");
                System.out.println("6. Calculate Pentagon Area (Regular)");
                System.out.println("7. Calculate Hexagon Area (Regular)");
                System.out.println("8. Calculate Rhombus Area");
                System.out.println("9. Exit");
                System.out.print("Enter your choice: ");

                try {
                    choice = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    double area;

                    switch (choice) {
                        case 1:
                            System.out.println("Calculating Triangle Area");
                            double base = getPositiveDoubleInput(scanner, "Enter base: ");
                            double height = getPositiveDoubleInput(scanner, "Enter height: ");
                            area = calculateTriangleArea(base, height);
                            System.out.println("The area of the Triangle is: " + area);
                            break;
                        case 2:
                            System.out.println("Calculating Square Area");
                            double side = getPositiveDoubleInput(scanner, "Enter side: ");
                            area = calculateSquareArea(side);
                            System.out.println("The area of the Square is: " + area);
                            break;
                        case 3:
                            System.out.println("Calculating Rectangle Area");
                            double length = getPositiveDoubleInput(scanner, "Enter length: ");
                            double width = getPositiveDoubleInput(scanner, "Enter width: ");
                            area = calculateRectangleArea(length, width);
                            System.out.println("The area of the Rectangle is: " + area);
                            break;
                        case 4:
                            System.out.println("Calculating Circle Area");
                            double radius = getPositiveDoubleInput(scanner, "Enter radius: ");
                            area = calculateCircleArea(radius);
                            System.out.println("The area of the Circle is: " + area);
                            break;
                        case 5:
                            System.out.println("Calculating Trapezoid Area");
                            double trapBase1 = getPositiveDoubleInput(scanner, "Enter base1: ");
                            double trapBase2 = getPositiveDoubleInput(scanner, "Enter base2: ");
                            double trapHeight = getPositiveDoubleInput(scanner, "Enter height: ");
                            area = calculateTrapezoidArea(trapBase1, trapBase2, trapHeight);
                            System.out.println("The area of the Trapezoid is: " + area);
                            break;
                        case 6:
                            System.out.println("Calculating Pentagon Area (Regular)");
                            double pentagonSide = getPositiveDoubleInput(scanner, "Enter side length: ");
                            area = calculatePentagonArea(pentagonSide);
                            System.out.println("The area of the Pentagon is: " + area);
                            break;
                        case 7:
                            System.out.println("Calculating Hexagon Area (Regular)");
                            double hexagonSide = getPositiveDoubleInput(scanner, "Enter side length: ");
                            area = calculateHexagonArea(hexagonSide);
                            System.out.println("The area of the Hexagon is: " + area);
                            break;
                        case 8:
                            System.out.println("Calculating Rhombus Area");
                            double diag1 = getPositiveDoubleInput(scanner, "Enter diagonal1: ");
                            double diag2 = getPositiveDoubleInput(scanner, "Enter diagonal2: ");
                            area = calculateRhombusArea(diag1, diag2);
                            System.out.println("The area of the Rhombus is: " + area);
                            break;
                        case 9:
                            System.out.println("Exiting program.");
                            break;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a number for the menu choice.");
                    choice = 0; // Set choice to a non-exit value to continue the loop
                }
            } while (choice != 9);
        }
    }
}
