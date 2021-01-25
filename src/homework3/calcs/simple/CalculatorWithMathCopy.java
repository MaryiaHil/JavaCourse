package homework3.calcs.simple;

import homework3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {
    // Деление
    public double divide(double a, double b) {
        return a / b;
    }

    // Умножение
    public double multiply(double a, double b) {
        return a * b;
    }

    // Вычитание
    public double minus(double a, double b) {
        return a - b;
    }

    // Сложение
    public double plus(double a, double b) {
        return a + b;
    }

    // Возведение в целую степень дробного положительного числа
    public double pow(double value, int powValue) {
        return Math.pow(value, powValue);
    }

    // Модуль числа
    public double abs(double a) {
        return Math.abs(a);
    }

    // Корень из числа
    public double sqrt(double a) {
        return Math.sqrt(a);
    }
}
