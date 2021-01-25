package homework3.runners;

import homework3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends calc = new CalculatorWithMathExtends();
        // 4.1 + 15 * 7 + (28 / 5) ^ 2
        // 1 step
        double number1 = calc.multiply(15, 7);
        // 2 step
        double number2 = calc.pow(calc.divide(28, 5), 2);
        // 3 step
        double result = calc.plus(calc.plus(number1, number2), 4.1);

        System.out.println("Результат выражения: " + result);
    }
}
