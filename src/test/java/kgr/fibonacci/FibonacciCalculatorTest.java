package kgr.fibonacci;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciCalculatorTest {

    private FibonacciCalculator calculator;

    @Before
    public void setUp() {
        calculator = new FibonacciCalculator();
    }

    @Test
    public void calculate_0() {
        assertEquals(1, calculator.fibonacciAt(0));
    }

    @Test
    public void calculate_1() {
        assertEquals(1, calculator.fibonacciAt(1));
    }

    @Test
    public void calculate_2() {
        assertEquals(2, calculator.fibonacciAt(2));
    }

    @Test
    public void calculate_3() {
        assertEquals(3, calculator.fibonacciAt(3));
    }

    @Test
    public void calculate_4() {
        assertEquals(5, calculator.fibonacciAt(4));
    }

    @Test(expected = IllegalArgumentException.class)
    public void calculate_fails_wit_invalid_position() {
        calculator.fibonacciAt(-1);
    }
}