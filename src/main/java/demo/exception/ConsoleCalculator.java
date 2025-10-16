package demo.exception;

import java.util.Scanner;

public class ConsoleCalculator implements Runnable {
    private Calculator calculator;
    private Scanner scanner = new Scanner(System.in);
    public ConsoleCalculator(Calculator calculator) {
        this.calculator=calculator;
    }

    @Override
    public void run() {
        System.out.println("Добро пожаловать в калькулятор");
        System.out.println("Для вычисления необходимо ввести:а,b и значение");
        //System.out.println("Для получения списка значений введите --info");
        while (true) {
            try {
                System.out.println("Значение вычисления:");
                String str = scanner.nextLine();
                System.out.println("Значение a:");
                double a = scanner.nextDouble();
                System.out.println("Введите b:");
                double b = scanner.nextDouble();
                double res = calculator.calculate(str, a, b);
                System.out.println("результат:"+res);
                break;
            } catch (RuntimeException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
