package homework2.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 2.1 Написать метод public static int[] arrayFromConsole() рядом с main.
 * Данный метод размер массива и каждый его элемент запрашивает у пользователя через консоль.
 * Пример int[] container = arrayFromConsole().
 * Результат: В методе arrayFromConsole будет запрошена информация у пользователя,
 * пользователь вводит размер (3) и его элементы по порядку {4, 17, 32}.
 * Соответсвенно будет создан массив размером 3 с элементами {4, 17, 32} и сохранён в переменную container.
 */
public class ArrayFromConsoleMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] newArr = arrayFromConsole(scanner);
        System.out.println(Arrays.toString(newArr));
        scanner.close();
    }

    public static int[] arrayFromConsole(Scanner scanner) {
        System.out.print("Введите размер массива (число): ");
        int arrLength = scanner.nextInt();

        int[] container = new int[arrLength];
        for (int i = 0; i < container.length; i++) {
            System.out.print("Введите элемент массива (число): ");
            int element = scanner.nextInt();
            container[i] = element;
        }
        return container;
    }
}
