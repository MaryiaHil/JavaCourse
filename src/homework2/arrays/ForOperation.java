package homework2.arrays;

import homework2.arrays.api.IArraysOperation;

public class ForOperation implements IArraysOperation {
    @Override
    public String allArrayElements(int[] arr) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            builder.append (arr[i]).append(" ");
        }
        return builder.toString();
    }

    @Override
    public String eachSecondElement(int[] arr) {
        int i = 1;
        StringBuilder builder = new StringBuilder();
        for (int value : arr) {
            if (i % 2 == 0) {
                builder.append (value).append(" ");
            }
            i++;
        }
        return builder.toString();
    }

    @Override
    public String reverseOrderArray(int[] arr) {
        StringBuilder builder = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            builder.append (arr[i]).append(" ");
        }
        return builder.toString();
    }
}
