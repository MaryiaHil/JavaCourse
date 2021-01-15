package homework2.loops;

import java.util.Scanner;

/**
 * 1.3 Возведение в степень. Через консоль пользователь вводит два числа. Первое число это число которое мы будем
 * возводить, второе число это степень в которую возводят первое число. Степень - только положительная и целая.
 * Возводимое число - может быть отрицательным и оно будет дробным. Math использовать нельзя.
 */
public class ExponentiationMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возводимое число.");
        double number = scanner.nextDouble();
        System.out.println("Введите еще одно число (степень): оно должно быть положительное и целое.");
        int power = scanner.nextInt();
        double result = exponentNumber(number, power);
        System.out.println(number + " ^ " + power + " = " + result);
        scanner.close();
    }

    public static double exponentNumber(double num, int power) {
        double count = 1;
        for (int i = 0; i < power; i++) {
            count *= num;
        }
        return count;
    }
}

