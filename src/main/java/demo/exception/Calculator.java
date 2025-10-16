package demo.exception;

import demo.Addition;
import demo.Operation;
import demo.Subtraction;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    private final Map<String, Operation> operations;

    public Calculator() {
        operations = new HashMap<>();
        initializeOperation();
    }

    private void initializeOperation() {
        registrationOperation("+", new Addition());
        registrationOperation("-", new Subtraction());
        registrationOperation("*", new Multiplication());
        registrationOperation("/", new Division());
    }

    private void registrationOperation(String symbol, Operation operation) {
        operations.put(symbol, operation);
    }

    public double calculate(String operationSymbol, double a, double b) {
        if (operationSymbol == null || operationSymbol.isEmpty() || !operations.containsKey(operationSymbol))
            throw new IllegalArgumentException(
                    "Некорректная операция.Список доступных операций:" + operations.keySet());
        return operations.get(operationSymbol).execute(a,b);
    }

    public double calculate(Operation operation, double a, double b) {
        if (operation == null) throw new DivisionException("operation is null");
        return operation.execute(a, b);
    }

}
