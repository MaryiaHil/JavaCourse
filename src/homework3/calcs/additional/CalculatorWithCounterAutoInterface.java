package homework3.calcs.additional;

import homework3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoInterface {
    private long count;

    private final ICalculator calculator;

    public CalculatorWithCounterAutoInterface(ICalculator calculator){
        this.calculator = calculator;
    }


    public double divide(double a, double b) {
        count++;
        return calculator.divide(a, b);
    }

    public double multiply(double a, double b) {
        count++;
        return calculator.multiply(a, b);
    }

    public double minus(double a, double b) {
        count++;
        return calculator.minus(a, b);
    }

    public double plus(double a, double b) {
        count++;
        return calculator.plus(a, b);
    }

    public double pow(double value, int powValue) {
        count++;
        return calculator.pow(value, powValue);
    }

    public double abs(double a) {
        count++;
        return calculator.abs(a);
    }

    public double sqrt(double a) {
        count++;
        return calculator.sqrt(a);
    }

    public long getCountOperation(){
        return count;
    }

}
