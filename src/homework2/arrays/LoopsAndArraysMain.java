package homework2.arrays;

import java.util.Scanner;

/**
 * 2.2 Перебор массива при помощи do....while, while, for, foreach. Элементы массива вводить используя метод
 * arrayFromConsole(). Все задачи в одном классе, в отдельных методах.
 * 2.2.1 Вывести все элементы в консоль.
 * 2.2.2 Вывести каждый второй элемент массива в консоль.
 * 2.2.3 Вывести все элементы массива в консоль в обратном порядке
 */
public class LoopsAndArraysMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] newArr = arrayFromConsole(scanner);
        allArrayElements1(newArr);
        allArrayElements2(newArr);
        allArrayElements3(newArr);
        allArrayElements4(newArr);
        eachSecondElement1(newArr);
        eachSecondElement2(newArr);
        eachSecondElement3(newArr);
        eachSecondElement4(newArr);
        reverseOrderArray1(newArr);
        reverseOrderArray2(newArr);
        reverseOrderArray3(newArr);
        reverseOrderArray4(newArr);
        scanner.close();
    }

    public static int[] arrayFromConsole(Scanner scanner) {
        System.out.println("Введите размер массива (число): ");
        int arrLength = scanner.nextInt();

        int[] container = new int[arrLength];
        for (int i = 0; i < container.length; i++) {
            System.out.println("Введите элемент массива (число): ");
            int element = scanner.nextInt();
            container[i] = element;
        }
        return container;
    }

    public static void allArrayElements1(int[] arr) {
        int i = 0;
        System.out.print("Все элементы массива: ");
        do {
            System.out.print(arr[i] + " ");
            i++;
        } while (i < arr.length);
        System.out.println("");
    }

    public static void allArrayElements2(int[] arr) {
        int i = 0;
        System.out.print("Все элементы массива: ");
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println("");
    }

    public static void allArrayElements3(int[] arr) {
        System.out.print("Все элементы массива: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public static void allArrayElements4(int[] arr) {
        System.out.print("Все элементы массива: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println("");
    }

    public static void eachSecondElement1(int[] arr) {
        int i = 1;
        System.out.print("Каждый второй элемент: ");
        do {
            System.out.print(arr[i] + " ");
            i += 2;
        } while (i < arr.length);
        System.out.println("");
    }

    public static void eachSecondElement2(int[] arr) {
        int i = 1;
        System.out.print("Каждый второй элемент: ");
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i += 2;
        }
        System.out.println("");
    }

    public static void eachSecondElement3(int[] arr) {
        System.out.print("Каждый второй элемент: ");
        for (int i = 1; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public static void eachSecondElement4(int[] arr) {
        int i = 1;
        System.out.print("Каждый второй элемент: ");
        for (int value : arr) {
            if (i % 2 == 0) {
                System.out.print(value + " ");
            }
            i++;
        }
        System.out.println("");
    }

    public static void reverseOrderArray1(int[] arr) {
        int i = arr.length - 1;
        System.out.print("Все элементы массива в обратном порядке: ");
        do {
            System.out.print(arr[i] + " ");
            i--;
        } while (i >= 0);
        System.out.println("");
    }

    public static void reverseOrderArray2(int[] arr) {
        int i = arr.length - 1;
        System.out.print("Все элементы массива в обратном порядке: ");
        while (i >= 0) {
            System.out.print(arr[i] + " ");
            i--;
        }
        System.out.println("");
    }

    public static void reverseOrderArray3(int[] arr) {
        System.out.print("Все элементы массива в обратном порядке: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public static void reverseOrderArray4(int[] arr) {
        int[] revArr = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            revArr[j] = arr[i];
            j++;
        }
        System.out.print("Все элементы массива в обратном порядке: ");
        for (int value : revArr) {
            System.out.print(value + " ");
        }
        System.out.println("");
    }
}
