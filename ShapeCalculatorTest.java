import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeCalculatorTest {

    private static final double DELTA = 0.001;

    @Test
    void testCalculateTriangleArea() {
        assertEquals(10.0, ShapeCalculator.calculateTriangleArea(4.0, 5.0), DELTA);
        assertEquals(25.0, ShapeCalculator.calculateTriangleArea(10.0, 5.0), DELTA);
    }

    @Test
    void testCalculateSquareArea() {
        assertEquals(16.0, ShapeCalculator.calculateSquareArea(4.0), DELTA);
        assertEquals(100.0, ShapeCalculator.calculateSquareArea(10.0), DELTA);
    }

    @Test
    void testCalculateRectangleArea() {
        assertEquals(20.0, ShapeCalculator.calculateRectangleArea(4.0, 5.0), DELTA);
        assertEquals(50.0, ShapeCalculator.calculateRectangleArea(10.0, 5.0), DELTA);
    }

    @Test
    void testCalculateCircleArea() {
        assertEquals(Math.PI * 25.0, ShapeCalculator.calculateCircleArea(5.0), DELTA);
        assertEquals(Math.PI * 100.0, ShapeCalculator.calculateCircleArea(10.0), DELTA);
    }

    @Test
    void testCalculateTrapezoidArea() {
        assertEquals(18.0, ShapeCalculator.calculateTrapezoidArea(3.0, 6.0, 4.0), DELTA);
        assertEquals(75.0, ShapeCalculator.calculateTrapezoidArea(10.0, 20.0, 5.0), DELTA);
    }

    @Test
    void testCalculatePentagonArea() {
        // For side = 1, area is approx 1.720477400588967
        assertEquals(1.720, ShapeCalculator.calculatePentagonArea(1.0), DELTA);
        // For side = 5, area is approx 1.720477400588967 * 25 = 43.01193501472417
        assertEquals(43.011, ShapeCalculator.calculatePentagonArea(5.0), DELTA);
    }

    @Test
    void testCalculateHexagonArea() {
        // For side = 1, area is approx 2.598076211353316
        assertEquals(2.598, ShapeCalculator.calculateHexagonArea(1.0), DELTA);
        // For side = 5, area is approx 2.598076211353316 * 25 = 64.9519052838329
        assertEquals(64.951, ShapeCalculator.calculateHexagonArea(5.0), DELTA);
    }

    @Test
    void testCalculateRhombusArea() {
        assertEquals(24.0, ShapeCalculator.calculateRhombusArea(6.0, 8.0), DELTA);
        assertEquals(50.0, ShapeCalculator.calculateRhombusArea(10.0, 10.0), DELTA);
    }
}
