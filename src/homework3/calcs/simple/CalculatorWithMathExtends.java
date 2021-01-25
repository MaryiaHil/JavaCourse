package homework3.calcs.simple;

import homework3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {
    @Override
    public double pow(double value, int powValue) {
        return Math.pow(value, powValue);
    }

    @Override
    public double abs(double a) {
        return Math.abs(a);
    }

    @Override
    public double sqrt(double a) {
        return Math.sqrt(a);
    }
}
