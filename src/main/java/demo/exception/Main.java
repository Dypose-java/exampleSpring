package demo.exception;

public class Main {
    public static void main(String[] args) {
        new RunnableCalculate(new ConsoleCalculator(new Calculator())).run();
    }
}
