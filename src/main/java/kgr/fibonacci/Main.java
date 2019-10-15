package kgr.fibonacci;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        fibonacciAt(0);
        fibonacciAt(1);
        fibonacciAt(2);
        fibonacciAt(3);
        fibonacciAt(4);
        fibonacciAt(5);
    }

    private static void fibonacciAt(long index) {
        FibonacciCalculator calc = new FibonacciCalculator();
        System.out.println(String.format("Fibonacci at index[%s]: %s", index, calc.fibonacciAt(index)));
    }

}
