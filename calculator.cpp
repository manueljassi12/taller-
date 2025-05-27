// Needed for input/output operations (std::cout, std::cin)
#include <iostream>
// Needed for string manipulation (std::string)
#include <string>
// Needed for standard exceptions (std::runtime_error)
#include <stdexcept>
// Needed for std::numeric_limits (for clearing input buffer)
#include <limits>

// Represents a simple calculator capable of basic arithmetic operations.
class Calculator {
public:
    // Adds two double precision numbers.
    // Parameters:
    //   a: The first number.
    //   b: The second number.
    // Returns: The sum of a and b.
    double add(double a, double b);

    // Subtracts the second double precision number from the first.
    // Parameters:
    //   a: The minuend.
    //   b: The subtrahend.
    // Returns: The difference between a and b.
    double subtract(double a, double b);

    // Multiplies two double precision numbers.
    // Parameters:
    //   a: The first number.
    //   b: The second number.
    // Returns: The product of a and b.
    double multiply(double a, double b);

    // Divides the first double precision number by the second.
    // Parameters:
    //   a: The dividend.
    //   b: The divisor.
    // Returns: The quotient of a divided by b.
    // Throws: std::runtime_error if the divisor (b) is zero.
    double divide(double a, double b);
};

// Implementation of Calculator::add
double Calculator::add(double a, double b) {
    return a + b;
}

// Implementation of Calculator::subtract
double Calculator::subtract(double a, double b) {
    return a - b;
}

// Implementation of Calculator::multiply
double Calculator::multiply(double a, double b) {
    return a * b;
}

// Implementation of Calculator::divide
double Calculator::divide(double a, double b) {
    if (b == 0) {
        // Throw a runtime_error if division by zero is attempted
        throw std::runtime_error("Cannot divide by zero.");
    }
    return a / b;
}

// Main function: entry point of the program.
// It creates a Calculator object, prompts the user for input,
// performs the calculation, and displays the result or an error message.
int main() {
    Calculator calculator; // Create an instance of the Calculator class
    double num1, num2;
    std::string operation_str; // Stores the arithmetic operation as a string

    // --- Input Gathering and Validation ---
    // Get the first number from the user
    std::cout << "Enter the first number: ";
    if (!(std::cin >> num1)) { // Check if the input is a valid double
        std::cerr << "Invalid input. Please enter numbers only." << std::endl;
        std::cin.clear(); // Clear error flags from std::cin
        // Discard the rest of the incorrect input line to prevent further errors
        std::cin.ignore(std::numeric_limits<std::streamsize>::max(), '\n');
        return 1; // Exit the program with an error code
    }

    // Get the operation from the user
    std::cout << "Enter an operation (+, -, *, /): ";
    std::cin >> operation_str;

    // Get the second number from the user
    std::cout << "Enter the second number: ";
    if (!(std::cin >> num2)) { // Check if the input is a valid double
        std::cerr << "Invalid input. Please enter numbers only." << std::endl;
        std::cin.clear(); // Clear error flags
        // Discard the rest of the incorrect input line
        std::cin.ignore(std::numeric_limits<std::streamsize>::max(), '\n');
        return 1; // Exit the program with an error code
    }

    double result; // Variable to store the calculation result

    // --- Operation Dispatch and Calculation ---
    // Perform the calculation based on the entered operation
    if (operation_str == "+") {
        result = calculator.add(num1, num2);
        std::cout << "Result: " << result << std::endl;
    } else if (operation_str == "-") {
        result = calculator.subtract(num1, num2);
        std::cout << "Result: " << result << std::endl;
    } else if (operation_str == "*") {
        result = calculator.multiply(num1, num2);
        std::cout << "Result: " << result << std::endl;
    } else if (operation_str == "/") {
        try {
            // Attempt to divide, which might throw an exception
            result = calculator.divide(num1, num2);
            std::cout << "Result: " << result << std::endl;
        } catch (const std::runtime_error& e) {
            // Catch and handle the division by zero error
            std::cerr << "Error: " << e.what() << std::endl; // Print the exception message
            return 1; // Exit the program with an error code
        }
    } else {
        // Handle invalid operation input
        std::cerr << "Invalid operation." << std::endl;
        return 1; // Exit the program with an error code
    }

    return 0; // Indicate successful execution
}
