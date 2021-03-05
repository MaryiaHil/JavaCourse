package homework2.loops;

/**
 * 1.1.2.Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе,
 * используя рекурсию
 */
public class Recursion {

//    public static void main(String[] args) {
//        if (args.length != 1) {
//            System.out.println("Only one argument is needed!");
//            return;
//        }
//        int argument = Integer.parseInt(args[0]);
//        if (argument < 0 || argument > 20) {
//            System.out.println("Please input another value as a program argument (between 0 and 20).");
//            return;
//        }
//        System.out.println(factorialWithRecursion(argument));
//    }

    public static long factorialWithRecursion(int number) {
        if (number == 1) {
            return number;
        } else {
            return number * factorialWithRecursion(number - 1);
        }
    }
}