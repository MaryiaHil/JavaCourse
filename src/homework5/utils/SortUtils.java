package homework5.utils;

import java.util.Comparator;
import java.util.List;

public class SortUtils {
    // Bubble sorting algorithm
    public static <T> void bubbleSort(List<T> container, Comparator<T> comparator) {
        int size = container.size(); // the length of the array

        for (int out = size - 1; out >= 1; out--) { // outer loop which starts from the end of the array

            for (int in = 0; in < out; in++) { // inner loop which starts from the beginning of the array
                T left = container.get(in);
                T right = container.get(in + 1);
                int compare = comparator.compare(left, right);
                if (compare > 0) {
                    // swapping elements
                    container.set(in, right);
                    container.set(in + 1, left);
                }
            }
        }
    }

    // Shaker sorting algorithm (enhanced Bubble sorting)
    public static <T> void shakerSort(List<T> container, Comparator<T> comparator) {
        int leftSide = 0; // the beginning of the array
        int rightSide = container.size() - 1; // the end of the array - 1

        do {
            for (int i = leftSide; i < rightSide; i++) { // finding the max value from left to the right
                T leftEl = container.get(i);
                T rightEl = container.get(i + 1);
                int compare = comparator.compare(leftEl, rightEl);
                if (compare > 0) {
                    // swapping elements
                    container.set(i, rightEl);
                    container.set(i + 1, leftEl);
                }
            }
            rightSide--; // to lessen the amount of iterations

            for (int i = rightSide; i > leftSide; i--) { // finding the min value from right to the left
                T rightEl = container.get(i);
                T leftEl = container.get(i - 1);
                int compare = comparator.compare(rightEl, leftEl);
                if (compare < 0) {
                    container.set(i, leftEl);
                    container.set(i - 1, rightEl);
                }
            }
            leftSide++; // to lessen the amount of iterations
        } while (leftSide < rightSide);
    }
}
