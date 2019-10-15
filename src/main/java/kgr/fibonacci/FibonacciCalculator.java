package kgr.fibonacci;

public class FibonacciCalculator {

    public long fibonacciAt(long position) {
        if(position < 0) {
            throw new IllegalArgumentException();
        } else if(position <= 1) {
            return 1;
        } else {
            return fibonacciAt(position -1) + fibonacciAt(position -2);
        }
    }
}
