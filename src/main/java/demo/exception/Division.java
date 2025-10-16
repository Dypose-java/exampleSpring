package demo.exception;

import demo.Operation;

public class Division  extends Operation {
    @Override
    public double execute(double a, double b) {
        this.validateNumber(a,b);
        if (a==0||b==0) throw new DivisionException("Деление на ноль!");
        return a/b;
    }
}
