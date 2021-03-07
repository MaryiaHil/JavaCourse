package homework2.loops;

import java.util.Arrays;
import java.util.Random;

/**
 * 1.4.* Умножать число long a = 1; пока не произойдёт переполнение.
 * В конце в консоль вывести сообщение со значением до переполнения и после переполнения.
 * Умножать на: 1.4.1. 3, 1.4.2. 188, 1.4.3. -19, 1.4.4. Да и вообще на любое целочисленное
 */
public class LongNumber {

//    public static void main(String[] args) {
//        System.out.println(Arrays.toString(beforeAfterOverflow(1000000, 5)));
//    }

    public static long[] beforeAfterOverflow(long originalNumber, int multiplier) {
        long[] arr = new long[2];
        if (multiplier > 0) {
            long previousValue = 0;
            while (originalNumber > 0) {
                previousValue = originalNumber;
                originalNumber *= multiplier;
            }
            arr[0] = previousValue;
            arr[1] = originalNumber;
            return arr;
        } else {
            originalNumber = -originalNumber;
            long previousValue = 0;
            while (originalNumber < 0) {
                previousValue = originalNumber;
                originalNumber = Math.abs(originalNumber);
                originalNumber *= multiplier;
            }
            arr[0] = previousValue;
            arr[1] = originalNumber;
            return arr;
        }
    }
}




