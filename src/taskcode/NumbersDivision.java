package taskcode;
/*
Вводятся два целых числа. Проверить делится ли первое на второе.
Вывести на экран сообщение об этом, а также остаток (если он есть) и частное (в любом случае).
 */
public class NumbersDivision {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            int a = (int) (Math.random() * 100 + 1);
            int b = (int) (Math.random() * 10 + 1);
            divideNumber(a, b);
            System.out.println("----------------------");
        }

    }

    public static void divideNumber(int x, int y) {
        int result = x / y;
        if (x % y == 0) {
            System.out.println(x + " полностью делится на " + y);
        } else {
            int remainder = x % y;
            System.out.println(x + " полностью не делится на " + y);
            System.out.println("Остаток от деления: " + remainder);
        }
        System.out.println("Результат деления: " + result);
    }


}
