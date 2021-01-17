package homework1.taskcode;

import java.util.Scanner;

/**
 * Перевести число, введенное пользователем, в байты или килобайты в зависимости от его выбора.
 * Чуть-чуть переделала, чтобы получать boolean и использовать его в if.
 */
public class ByteToKilobyte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        boolean b;
        System.out.println("Введите число: ");
        a = scanner.nextInt();
        System.out.println("Перевести в байты (true) или килобайты (false): ");
        b = scanner.nextBoolean();
        System.out.println("Число: " + changeNumber(a, b));

    }

    public static int changeNumber(int a, boolean b) {
        if (b) {
            a *= 1024;
        } else {
            a /= 1024;
        }
        return a;

    }
}



