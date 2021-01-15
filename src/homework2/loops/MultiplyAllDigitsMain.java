package homework2.loops;

/**
 * 1.2 Все цифры из числа введенного через аргумент к исполняемой программе перемножить между собой
 * и вывести ход вычислений в консоль. Пользователь обязан ввести целое число.
 * Если ввели не целое то выдать сообщение о том что пользователь ввёл некорректные данные.
 */
public class MultiplyAllDigitsMain {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please enter a valid program argument: it should be one integer.");
            return;
        }
        String argument = args[0];
        if (!isInteger(argument)) {
            if (isDouble(argument)) {
                System.out.println("It's a fractional number. Please enter an integer as a program argument.");
            } else {
                System.out.println("It's not a number. Please enter an integer as a program argument.");
            }
        } else {
            int x = args[0].length();
            int[] arr = new int[x];
            int count = 1;
            for (int i = 0; i < arr.length; i++) {
                char a = argument.charAt(i);
                arr[i] = Character.getNumericValue(a);
                count *= arr[i];
                if (i == arr.length - 1) {
                    System.out.print(arr[i] + " = ");
                } else {
                    System.out.print(arr[i] + " * ");
                }
            }
            System.out.println(count);
        }
    }

    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    public static boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

}


