package homework2.sorts;

import java.util.Arrays;
import java.util.Random;

import static homework2.sorts.SortsMethods.*;

public class SortsMain {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] testArray1 = {1, 2, 3, 4, 5, 6};
        int[] testArray2 = {1, 1, 1, 1};
        int[] testArray3 = {9, 1, 5, 99, 9, 9};
        int[] testArray4 = {};
        int[] testArray5 = createArrayRandom();
        int[] sortedArray1 = bubbleSort(testArray1);
        int[] sortedArray2 = shakerSort(testArray1);
        int[] sortedArray3 = shakerSort(testArray2);
        int[] sortedArray4 = shakerSort(testArray2);
        int[] sortedArray5 = shakerSort(testArray3);
        int[] sortedArray6 = shakerSort(testArray3);
        int[] sortedArray7 = shakerSort(testArray4);
        int[] sortedArray8 = shakerSort(testArray4);
        int[] sortedArray9 = shakerSort(testArray5);
        int[] sortedArray10 = shakerSort(testArray5);
        System.out.println(Arrays.toString(sortedArray1));
        System.out.println(Arrays.toString(sortedArray2));
        System.out.println(Arrays.toString(sortedArray3));
        System.out.println(Arrays.toString(sortedArray4));
        System.out.println(Arrays.toString(sortedArray5));
        System.out.println(Arrays.toString(sortedArray6));
        System.out.println(Arrays.toString(sortedArray7));
        System.out.println(Arrays.toString(sortedArray8));
        System.out.println(Arrays.toString(sortedArray9));
        System.out.println(Arrays.toString(sortedArray10));
    }
}
