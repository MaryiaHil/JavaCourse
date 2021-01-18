package homework2.sorts;

import java.util.Arrays;

import static homework2.sorts.SortMethods.*;

/**
 * Выполнить сортировку массива с числами. !!!!ВНИМАНИЕ!!!! код сортировок в данном ДЗ не должен дублироваться и
 * не должен находиться в main. Дублирование кода сортировок приведёт к провалу выполнения данного задания.
 * Итогом выполнения данного задания будет 1 класс который содержит методы с сортировками,
 * и 1 класс из которого вызываются данные методы
 */
public class SortsMain {
    public static void main(String[] args) {
        int[] testArray1 = {1, 2, 3, 4, 5, 6};
        System.out.println("The array before sorting: " + Arrays.toString(testArray1));
        bubbleSort(testArray1);
        System.out.println("The array after sorting: " + Arrays.toString(testArray1));

        int[] testArray2 = {1, 1, 1, 1};
        System.out.println("The array before sorting: " + Arrays.toString(testArray2));
        bubbleSort(testArray2);
        System.out.println("The array after sorting: " + Arrays.toString(testArray2));

        int[] testArray3 = {9, 1, 5, 99, 9, 9};
        System.out.println("The array before sorting: " + Arrays.toString(testArray3));
        bubbleSort(testArray3);
        System.out.println("The array after sorting: " + Arrays.toString(testArray3));

        int[] testArray4 = {};
        System.out.println("The array before sorting: " + Arrays.toString(testArray4));
        bubbleSort(testArray4);
        System.out.println("The array after sorting: " + Arrays.toString(testArray4));

        int[] testArray5 = createArrayRandom();
        System.out.println("The array before sorting: " + Arrays.toString(testArray5));
        bubbleSort(testArray5);
        System.out.println("The array after sorting: " + Arrays.toString(testArray5));

        int[] testArray6 = {1, 2, 3, 4, 5, 6};
        System.out.println("The array before sorting: " + Arrays.toString(testArray6));
        shakerSort(testArray6);
        System.out.println("The array after sorting: " + Arrays.toString(testArray6));

        int[] testArray7 = {1, 1, 1, 1};
        System.out.println("The array before sorting: " + Arrays.toString(testArray7));
        shakerSort(testArray7);
        System.out.println("The array after sorting: " + Arrays.toString(testArray7));

        int[] testArray8 = {9, 1, 5, 99, 9, 9};
        System.out.println("The array before sorting: " + Arrays.toString(testArray8));
        shakerSort(testArray8);
        System.out.println("The array after sorting: " + Arrays.toString(testArray8));

        int[] testArray9 = {};
        System.out.println("The array before sorting: " + Arrays.toString(testArray9));
        shakerSort(testArray9);
        System.out.println("The array after sorting: " + Arrays.toString(testArray9));

        int[] testArray10 = createArrayRandom();
        System.out.println("The array before sorting: " + Arrays.toString(testArray10));
        shakerSort(testArray10);
        System.out.println("The array after sorting: " + Arrays.toString(testArray10));
    }
}
