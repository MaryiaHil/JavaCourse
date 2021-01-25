package homework3.calcs.simple;

import homework3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {
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
        double result = 1;
        for (int i = 0; i < powValue; i++){
            result *= value;
        }
        return result;
    }

    // Модуль числа
    public double abs(double a) {
        return a < 0 ? -a : a;
    }

    // Корень из числа
    public double sqrt(double a) {
        int root = 1;
        while (root * root < a){
            root++;
        }
        return root;
    }
}
