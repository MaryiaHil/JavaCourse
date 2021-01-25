package homework3.runners;

import homework3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper calc = new CalculatorWithCounterAutoSuper();
        // 4.1 + 15 * 7 + (28 / 5) ^ 2
        // 1 step
        double number1 = calc.multiply(15, 7);

        // 2 step
        double number2 = calc.divide(28, 5);

        // 3 step
        double number3 = calc.pow(number2, 2);

        // 4 step
        double number4 = calc.plus(number3, number1);

        // 5 step
        double result = calc.plus(number4, 4.1);

        System.out.println("Результат выражения: " + result);
        System.out.println("Калькулятор отработал " + calc.getCountOperation() + " раз");
    }
}
