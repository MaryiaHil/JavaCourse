package homework2.loops;

import java.util.Random;

/**
 * 1.4.* Умножать число long a = 1; пока не произойдёт переполнение.
 * В конце в консоль вывести сообщение со значением до переполнения и после переполнения.
 * Умножать на: 1.4.1. 3, 1.4.2. 188, 1.4.3. -19, 1.4.4. Да и вообще на любое целочисленное
 */
public class LongNumberMain {

    public static void main(String[] args) {
        long a = 1L;

        // 1.4.1
        int b = 3;

        printBeforeAfterOverflow(a, b);

        // 1.4.2.
        b = 188;
        printBeforeAfterOverflow(a, b);

        // 1.4.3.
        b = -19;
        printBeforeAfterOverflow(a, b);

        // 1.4.4.
        Random random = new Random();
        b = random.nextInt();
        printBeforeAfterOverflow(a, b);
    }

    public static void printBeforeAfterOverflow(long originalNumber, int multiplier) {
        if (multiplier > 0) {
            long previousValue = 0;
            while (originalNumber > 0) {
                previousValue = originalNumber;
                originalNumber *= multiplier;
            }
            System.out.println("The number just before overflow: " + previousValue);
            System.out.println("The number after overflow: " + originalNumber);
        } else {
            originalNumber = -originalNumber;
            long previousValue = 0;
            while (originalNumber < 0) {
                previousValue = originalNumber;
                originalNumber = Math.abs(originalNumber);
                originalNumber *= multiplier;
            }
            System.out.println("The number just before overflow: " + previousValue);
            System.out.println("The number after overflow: " + originalNumber);
        }
    }
}




