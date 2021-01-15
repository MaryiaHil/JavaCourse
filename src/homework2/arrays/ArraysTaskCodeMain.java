package homework2.arrays;

import java.util.Arrays;

public class ArraysTaskCodeMain {

    public static void main(String[] args) {
        int[] newArr = {14, 65, 3, 9, 17, 4, 6, 5};
        System.out.println("The amount of even positive numbers is " + checkPositiveEvenNumbers(newArr));
        System.out.println("Out of even indices the maximum value is " + findMaxElement(newArr));
        lessThanAverage(newArr);
        int[] newArr2 = findTwoMinElements(newArr);
        System.out.println("2 minimum values are " + Arrays.toString(newArr2));
        System.out.println("The sum of all array digits is " + sumArrayDigits(newArr));
        shrinkArray(newArr, 5, 9);
        System.out.println("The changed array is: " + Arrays.toString(newArr));
    }

    // 2.4.1 Сумма четных положительных элементов массива
    public static int checkPositiveEvenNumbers(int[] arr) {
        int counter = 0;
        for (int value : arr) {
            if (value % 2 == 0 && value >= 0) {
                counter++;
            }
        }
        return counter;
    }

    // 2.4.2 Максимальный из элементов массива с четными индексами
    public static int findMaxElement(int[] arr) {
        int maxValue = arr[0];
        for (int i = 2; i < arr.length; i += 2) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    // 2.4.3 Элементы массива, которые меньше среднего арифметического
    public static void lessThanAverage(int[] arr) {
        double sum = 0;
        for (int value : arr) {
            sum += value;
        }
        double avg = sum / arr.length;

        System.out.print("These elements are less than arithmetic average " + "(" + avg + ") of all elements: ");
        for (int value : arr) {
            if (value < avg) {
                System.out.print(value + " ");
            }
        }
        System.out.println("");
    }

    // 2.4.4 Найти два наименьших (минимальных) элемента массива
    public static int[] findTwoMinElements(int[] arr) {
        int min1 = arr[0];
        int min2 = arr[1];
        if (min2 < min1) {
            min1 = arr[1];
            min2 = arr[0];
        }
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] < min1) {
                min2 = min1;
                min1 = arr[i];
            } else if (arr[i] < min2) {
                min2 = arr[i];
            }
        }
        return new int[]{min1, min2};
    }

    // 2.4.5 Сжать массив, удалив из него все элементы, величина которых находится в интервале [а, b].
    // Освободившиеся в конце массива элементы заполнить нулями.
    public static void shrinkArray(int[] arr, int a, int b) {
        int i = 0;
        int n = arr.length;
        while (i < n) {
            if (arr[i] >= a && arr[i] <= b) {
                n--;
                for (int j = i; j < n; j++) {
                    arr[j] = arr[j + 1];
                }
            } else {
                i++;
            }
        }
        for (int k = n; k < arr.length; k++) {
            arr[k] = 0;
        }
    }

    // 2.4.6 Сумма цифр массива
    public static int sumArrayDigits(int[] arr) {
        int sum = 0;
        int num = 0;
        for (int value : arr) {
            num = value;
            while (num > 0) {
                sum += num % 10;
                num = num / 10;
            }
        }
        return sum;
    }
}
