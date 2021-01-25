package homework3.calcs.additional;

import homework3.calcs.simple.CalculatorWithMathCopy;
import homework3.calcs.simple.CalculatorWithMathExtends;
import homework3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoComposite {
    private long count;

    // Возможные варианты калькуляторов, которые могут быть переданы в конструктор
    private CalculatorWithOperator calculatorWithOperator;
    private CalculatorWithMathCopy calculatorWithMathCopy;
    private CalculatorWithMathExtends calculatorWithMathExtends;

    /**
     * Конструктор 1, который принимает объект типа CalculatorWithOperator
     */
    public CalculatorWithCounterAutoComposite(CalculatorWithOperator calculatorWithOperator) {
        this.calculatorWithOperator = calculatorWithOperator;
    }

    /**
     * Конструктор 2, который принимает объект типа CalculatorWithMathCopy
     */
    public CalculatorWithCounterAutoComposite(CalculatorWithMathCopy calculatorWithMathCopy) {
        this.calculatorWithMathCopy = calculatorWithMathCopy;
    }

    /**
     * Конструктор 3, который принимает объект типа CalculatorWithMathExtends
     */
    public CalculatorWithCounterAutoComposite(CalculatorWithMathExtends calculatorWithMathExtends) {
        this.calculatorWithMathExtends = calculatorWithMathExtends;
    }

    public double divide(double a, double b) {
        count++;
        if (calculatorWithOperator != null) {
            return calculatorWithOperator.divide(a, b);
        } else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.divide(a, b);
        } else {
            return calculatorWithMathExtends.divide(a, b);
        }
    }

    public double multiply(double a, double b) {
        count++;
        if (calculatorWithOperator != null) {
            return calculatorWithOperator.multiply(a, b);
        } else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.multiply(a, b);
        } else {
            return calculatorWithMathExtends.multiply(a, b);
        }
    }

    public double minus(double a, double b) {
        count++;
        if (calculatorWithOperator != null) {
            return calculatorWithOperator.minus(a, b);
        } else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.minus(a, b);
        } else {
            return calculatorWithMathExtends.minus(a, b);
        }
    }

    public double plus(double a, double b) {
        count++;
        if (calculatorWithOperator != null) {
            return calculatorWithOperator.plus(a, b);
        } else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.plus(a, b);
        } else {
            return calculatorWithMathExtends.plus(a, b);
        }
    }

    public double pow(double value, int powValue) {
        count++;
        if (calculatorWithOperator != null) {
            return calculatorWithOperator.pow(value, powValue);
        } else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.pow(value, powValue);
        } else {
            return calculatorWithMathExtends.pow(value, powValue);
        }
    }

    public double abs(double a) {
        count++;
        if (calculatorWithOperator != null) {
            return calculatorWithOperator.abs(a);
        } else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.abs(a);
        } else {
            return calculatorWithMathExtends.abs(a);
        }
    }

    public double sqrt(double a) {
        count++;
        if (calculatorWithOperator != null) {
            return calculatorWithOperator.sqrt(a);
        } else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.sqrt(a);
        } else {
            return calculatorWithMathExtends.sqrt(a);
        }
    }

    public long getCountOperation() {
        return count;
    }

}
