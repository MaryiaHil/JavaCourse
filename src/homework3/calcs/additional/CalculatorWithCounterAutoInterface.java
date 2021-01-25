package homework3.calcs.additional;

import homework3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoInterface implements ICalculator {
    private long count;

    private final ICalculator calculator;

    public CalculatorWithCounterAutoInterface(ICalculator calculator){
        this.calculator = calculator;
    }

    @Override
    public double divide(double a, double b) {
        count++;
        return calculator.divide(a, b);
    }

    @Override
    public double multiply(double a, double b) {
        count++;
        return calculator.multiply(a, b);
    }

    @Override
    public double minus(double a, double b) {
        count++;
        return calculator.minus(a, b);
    }

    @Override
    public double plus(double a, double b) {
        count++;
        return calculator.plus(a, b);
    }

    @Override
    public double pow(double value, int powValue) {
        count++;
        return calculator.pow(value, powValue);
    }

    @Override
    public double abs(double a) {
        count++;
        return calculator.abs(a);
    }

    @Override
    public double sqrt(double a) {
        count++;
        return calculator.sqrt(a);
    }

    public long getCountOperation(){
        return count;
    }

}
