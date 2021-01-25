package homework3.runners;

import homework3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic calc = new CalculatorWithCounterClassic();
        // 4.1 + 15 * 7 + (28 / 5) ^ 2
        // 1 step
        double number1 = calc.multiply(15, 7);
        calc.incrementCountOperation();

        // 2 step
        double number2 = calc.divide(28, 5);
        calc.incrementCountOperation();

        // 3 step
        double number3 = calc.pow(number2, 2);
        calc.incrementCountOperation();

        // 4 step
        double number4 = calc.plus(number3, number1);
        calc.incrementCountOperation();

        // 5 step
        double result = calc.plus(number4, 4.1);
        calc.incrementCountOperation();

        System.out.println("Результат выражения: " + result);
        System.out.println("Калькулятор отработал " + calc.getCountOperation() + " раз.");
    }
}
