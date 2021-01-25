package homework3.runners;

import homework3.calcs.additional.CalculatorWithCounterAutoInterface;
import homework3.calcs.api.ICalculator;
import homework3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoInterfaceMain {
    public static void main(String[] args) {
        ICalculator obj = new CalculatorWithMathExtends();
        CalculatorWithCounterAutoInterface calc = new CalculatorWithCounterAutoInterface(obj);

        // 4.1 + 15 * 7 + (28 / 5) ^ 2
        // 1 step
        double number1 = calc.multiply(15, 7);
        // 2 step
        double number2 = calc.pow(calc.divide(28, 5), 2);
        // 3 step
        double result = calc.plus(calc.plus(number1, number2), 4.1);

        System.out.println("Результат выражения: " + result);
        System.out.println("Калькулятор отработал " + calc.getCountOperation() + " раз.");
    }
}
