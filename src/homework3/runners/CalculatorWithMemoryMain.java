package homework3.runners;

import homework3.calcs.additional.CalculatorWithMemory;
import homework3.calcs.api.ICalculator;
import homework3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        ICalculator mathCalc = new CalculatorWithMathCopy();
        CalculatorWithMemory calc = new CalculatorWithMemory(mathCalc);

        // 4.1 + 15 * 7 + (28 / 5) ^ 2
        calc.plus(calc.plus(calc.multiply(15, 7), 4.1), calc.pow(calc.divide(28, 5), 2));
        calc.recordResult();
        System.out.println(calc.getMemory());
    }
}
