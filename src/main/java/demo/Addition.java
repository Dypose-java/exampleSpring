package demo;

public class Addition extends Operation{
    @Override
    public double execute(double a, double b) {
        this.validateNumber(a,b);
        return a+b;
    }
}
