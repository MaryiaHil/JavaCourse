package homework1.taskcode;

import java.util.Scanner;

/**
 * Определить, является ли год, который ввел пользователь, високосным или невисокосным.
 */
public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите год в формате YYYY: ");
        int year = in.nextInt();
        System.out.println("Год високосный: " + isLeapYear(year));
    }

    public static boolean isLeapYear(int y) {
        if ((y % 400 == 0) || ((y % 4 == 0) && (y % 100 != 0))) {
            return true;
        } else {
            return false;
        }
    }
}
