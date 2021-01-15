package homework2.loops;

/**
 * 1.1.1.Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе, используя
 * только цикл. Перемножить числа от 1 до числа(включительно) введенного через аргумент к исполняемой программе.
 * Есть нюанс с переполнением, можно добавить проверки и сообщения пользователю.
 */
public class ArgumentFactorialMain {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Only one argument can be handled.");
            return;
        }
        int argument = Integer.parseInt(args[0]);
        if (argument < 0 || argument > 20) {
            System.out.println("Please input another value as a program argument (between 0 and 20).");
            return;
        }
        factorial(argument);
    }

    public static void factorial(int number) {
        long counter = 1;
        for (int i = 1; i <= number; i++) {
            counter *= i;
            if (i == number) {
                System.out.print(i + " = ");
            } else {
                System.out.print(i + " * ");
            }
        }
        System.out.print(counter);
    }
}

