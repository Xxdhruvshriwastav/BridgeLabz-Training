package junit.test;
import org.junit.jupiter.api.Test;

import junit.BasicJunitTesting.calculator.Calculator;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.*;


class TestCalculator {

    static Calculator calcu;

    @BeforeAll
    static void setup() {
        calcu = new Calculator();
    }

    @Test
    void testAddition() {
        assertEquals(5, calcu.addition(2, 3));
    }

    @Test
    void testSubtraction() {
        assertEquals(2, calcu.subtraction(5, 3));
    }

    @Test
    void testMultiplication() {
        assertEquals(6, calcu.multiple(3, 2));
    }

    @Test
    void testDivision() {
        assertEquals(1, calcu.division(3, 2));
    }

    @Test
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class,
                () -> calcu.division(3, 0));
    }

    @AfterAll
    static void end() {
        System.out.println("Program completed");
    }
}
