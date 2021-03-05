package homework2.loops;

/**
 * 1.1.1.Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе, используя
 * только цикл. Перемножить числа от 1 до числа(включительно) введенного через аргумент к исполняемой программе.
 * Есть нюанс с переполнением, можно добавить проверки и сообщения пользователю.
 */
public class ArgumentFactorial {

    /**
     * Provides a number's factorial with explicit calculations
     * @param number for which a factorial is to be counted
     * @return String which represents the number's factorial and calculations
     */
    public static String factorial(int number) {
        long counter = 1;
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= number; i++) {
            counter *= i;
            builder.append(i).append(" * ");
        }
        builder.deleteCharAt(builder.length() - 1);
        builder.deleteCharAt(builder.length() - 1);
        builder.append("= ").append(counter);
        return builder.toString();
    }
}

