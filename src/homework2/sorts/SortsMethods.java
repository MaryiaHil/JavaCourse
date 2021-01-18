package homework2.sorts;

import java.util.Random;

public class SortsMethods {

    // Bubble sorting algorithm
    public static int[] bubbleSort(int[] arr) {
        int size = arr.length; // the length of the array
        int tempVar = 0; // the temporary variable which will be used for swapping

        for (int out = size - 1; out >= 1; out--) { // outer loop which starts from the end of the array

            for (int in = 0; in < out; in++) { // inner loop which starts from the beginning of the array
                if (arr[in] > arr[in + 1]) {
                    // swapping elements
                    tempVar = arr[in];
                    arr[in] = arr[in + 1];
                    arr[in + 1] = tempVar;
                }
            }
        }
        return arr;
    }

    // Shaker sorting algorithm (enhanced Bubble sorting)
    public static int[] shakerSort(int[] arr) {
        int tempVar = 0; // the temporary variable which will be used for swapping
        int leftSide = 0; // the beginning of the array
        int rightSide = arr.length - 1; // the end of the array - 1

        do {
            for (int i = leftSide; i < rightSide; i++) { // finding the max value from left to the right
                if (arr[i] > arr[i + 1]) {
                    // swapping elements
                    tempVar = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tempVar;
                }
            }
            rightSide--; // to lessen the amount of iterations

            for (int i = rightSide; i > leftSide; i--) { // finding the min value from right to the left
                if (arr[i] < arr[i - 1]) {
                    tempVar = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = tempVar;
                }
            }
            leftSide++; // to lessen the amount of iterations
        } while (leftSide < rightSide);

        return arr;
    }

    // The method for creating an array of random length and with random numbers
    public static int[] createArrayRandom() {
        Random rand = new Random();
        int sizeArr = rand.nextInt(10);
        int[] arr;
        arr = new int[sizeArr];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10);
        }
        return arr;
    }
}

