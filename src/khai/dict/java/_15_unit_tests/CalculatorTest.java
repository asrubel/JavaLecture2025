package khai.dict.java._15_unit_tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calculator = new Calculator();

        assertEquals(3, calculator.add(1, 2));
    }

    @Test
    @DisplayName("Add 1 and 2, result should be 3")
    void testAddition() {
        Calculator calculator = new Calculator();
        int expected = 3;
        int result = calculator.add(1, 2);

        assertEquals(expected, result);
    }

    @Test
    void subtract() {
        Calculator calculator = new Calculator();
        int expected = 2;
        int result = calculator.subtract(6, 4);

        assertEquals(expected, result);
    }

    @Test
    void multiply() {
        Calculator calculator = new Calculator();
        int expected = 6;
        int result = calculator.multiply(2, 3);

        assertEquals(expected, result);
    }

    @Test
    void divide() {
        Calculator calculator = new Calculator();
        int expected = 2;
        int result = calculator.divide(10, 5);

        assertEquals(expected, result);
    }

    @Test
    void divideByZero() {
        Calculator calculator = new Calculator();

        assertThrows(IllegalArgumentException.class,
                () -> calculator.divide(10, 0));
    }
}
