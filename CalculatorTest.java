import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testAdd() {
        assertEquals(5.0, calculator.add(2.0, 3.0));
        assertEquals(-5.0, calculator.add(-2.0, -3.0));
        assertEquals(2.0, calculator.add(2.0, 0.0));
    }

    @Test
    void testSubtract() {
        assertEquals(-1.0, calculator.subtract(2.0, 3.0));
        assertEquals(1.0, calculator.subtract(-2.0, -3.0));
        assertEquals(2.0, calculator.subtract(2.0, 0.0));
    }

    @Test
    void testMultiply() {
        assertEquals(6.0, calculator.multiply(2.0, 3.0));
        assertEquals(6.0, calculator.multiply(-2.0, -3.0));
        assertEquals(0.0, calculator.multiply(2.0, 0.0));
    }

    @Test
    void testDivide() {
        assertEquals(2.0, calculator.divide(6.0, 3.0));
        assertEquals(2.0, calculator.divide(-6.0, -3.0));
        assertEquals(0.5, calculator.divide(1.0, 2.0));
    }

    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(1.0, 0.0);
        });
        assertEquals("Cannot divide by zero.", exception.getMessage());
    }
}
