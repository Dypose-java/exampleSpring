package demo;

import demo.exception.OperationException;

public abstract class Operation {
    public abstract double execute(double a,double b);
    protected void validateNumber(double a,double b){
        if (Double.isNaN(a)||Double.isNaN(b)){
            throw new OperationException("value is Nan!");
        }
        if (Double.isInfinite(a)||Double.isInfinite(b)){
            throw new OperationException("value is infinite");
        }

    }
}
