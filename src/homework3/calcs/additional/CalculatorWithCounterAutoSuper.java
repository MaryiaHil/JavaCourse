package homework3.calcs.additional;

import homework3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    private long count;

    @Override
    public double pow(double value, int powValue) {
        count++;
        return super.pow(value, powValue);
    }

    @Override
    public double abs(double a) {
        count++;
        return super.abs(a);
    }

    @Override
    public double sqrt(double a) {
        count++;
        return super.sqrt(a);
    }

    @Override
    public double divide(double a, double b) {
        count++;
        return super.divide(a, b);
    }

    @Override
    public double multiply(double a, double b) {
        count++;
        return super.multiply(a, b);
    }

    @Override
    public double minus(double a, double b) {
        count++;
        return super.minus(a, b);
    }

    @Override
    public double plus(double a, double b) {
        count++;
        return super.plus(a, b);
    }

    public long getCountOperation(){
        return count;
    }
}
