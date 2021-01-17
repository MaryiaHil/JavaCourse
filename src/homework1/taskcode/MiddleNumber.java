package taskcode;

import java.util.Scanner;

/**
 * Вводятся три разных числа. Найти, какое из них является средним (больше одного, но меньше другого).
 */
public class MiddleNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Введите любое число: ");
            int a = in.nextInt();
            System.out.println("Введите любое число, которое не равняется предыдущему: ");
            int b = in.nextInt();
            System.out.println("Введите любое число, которое не равняется предыдущим двум: ");
            int c = in.nextInt();
            System.out.println("Среднее из трех: " + findMiddleNumber(a, b, c));
        }

    }

    public static int findMiddleNumber(int x, int y, int z) {
        int m;
        if ((x > y && x < z) || (y > x && z < x)) {
            m = x;
        } else if ((y > x && y < z) || (x > y && z < y)) {
            m = y;
        } else {
            m = z;
        }
        return m;
    }

}
