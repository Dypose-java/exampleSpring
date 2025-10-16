package demo.exception;

public class RunnableCalculate implements Runnable{
    private ConsoleCalculator consoleCalculator;

    public RunnableCalculate(ConsoleCalculator consoleCalculator) {
        this.consoleCalculator = consoleCalculator;
    }

    @Override
    public void run() {
        consoleCalculator.run();
    }
}
