package demo.exception;

import demo.Operation;

public class Multiplication extends Operation {
    @Override
    public double execute(double a, double b) {
        this.validateNumber(a,b);
        return a*b;
    }
}
