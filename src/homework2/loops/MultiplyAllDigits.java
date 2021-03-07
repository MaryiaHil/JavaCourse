package homework2.loops;

/**
 * 1.2 Все цифры из числа введенного через аргумент к исполняемой программе перемножить между собой
 * и вывести ход вычислений в консоль. Пользователь обязан ввести целое число.
 * Если ввели не целое то выдать сообщение о том что пользователь ввёл некорректные данные.
 */
public class MultiplyAllDigits {

    public static void main(String[] args) {
        System.out.println(multiplyAllDigits(99983547));
    }

    /**
     * Multiplies all digits of a number entered as an argument and provides explicit calculations
     * @param  number is a number which consists of digits to be multiplied
     * @return a String with all calculations and their result
     */
    public static String multiplyAllDigits(int number){
        String temp = Integer.toString(number);
        int[] arr = new int[temp.length()];
        long count = 1;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            char a = temp.charAt(i);
            arr[i] = Character.getNumericValue(a);
            count *= arr[i];
            if (i == arr.length - 1) {
                builder.append(arr[i] ).append(" = ");
            } else {
                builder.append(arr[i] ).append(" * ");
            }
        }
        return builder.append(count).toString();
    }

}


