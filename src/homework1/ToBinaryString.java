package homework1;

/**
 * 7.** Создать СТАТИЧЕСКИЙ метод String toBinaryString(byte number) и возвращает двоичное представление числа.
 * В методе можно использовать обычную математику которая описана в теории.
 * Теория https://planetcalc.ru/747. Если число отрицательное то выдавать дополнительный код.
 */
public class ToBinaryString {

    /**
     * Converts a decimal number into its binary representation.
     * @param number - is a decimal number of byte type: a minimum value of -128 and a maximum value of 127 (inclusive).
     * @return a binary number as a string.
     */
    public static String toBinaryString(byte number) {
        int n = number;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 8; i++){
            int bit = n & 1;
            builder.append(bit);
            n = n >> 1;
        }
        return builder.reverse().toString();
    }
}
