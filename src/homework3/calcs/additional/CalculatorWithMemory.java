package homework3.calcs.additional;

import homework3.calcs.api.ICalculator;

public class CalculatorWithMemory {
    private double memory;
    private double result;

    private final ICalculator calculator;

    public CalculatorWithMemory(ICalculator calculator) {
        this.calculator = calculator;
    }

    public double divide(double a, double b) {
        return result = calculator.divide(a, b);
    }

    public double multiply(double a, double b) {
        return result = calculator.multiply(a, b);
    }

    public double minus(double a, double b) {
        return result = calculator.minus(a, b);
    }

    public double plus(double a, double b) {
        return result = calculator.plus(a, b);
    }

    public double pow(double value, int powValue) {
        return result = calculator.pow(value, powValue);
    }

    public double abs(double a) {
        return result = calculator.abs(a);
    }

    public double sqrt(double a) {
        return result = calculator.sqrt(a);
    }

    public void recordResult() {
        memory = result;
    }

    public double getMemory() {
        double tempMemory = memory;
        memory = 0;
        return tempMemory;
    }


}
