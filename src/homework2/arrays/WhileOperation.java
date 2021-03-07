package homework2.arrays;

import homework2.arrays.api.IArraysOperation;

public class WhileOperation implements IArraysOperation {
    @Override
    public String allArrayElements(int[] arr) {
        int i = 0;
        StringBuilder builder = new StringBuilder();
        while (i < arr.length) {
            builder.append(arr[i]).append(" ");
            i++;
        }
        return builder.toString();
    }

    @Override
    public String eachSecondElement(int[] arr) {
        int i = 1;
        StringBuilder builder = new StringBuilder();
        while (i < arr.length) {
            builder.append(arr[i]).append(" ");
            i += 2;
        }
        return builder.toString();
    }

    @Override
    public String reverseOrderArray(int[] arr) {
        int i = arr.length - 1;
        StringBuilder builder = new StringBuilder();
        while (i >= 0) {
            builder.append(arr[i]).append(" ");
            i--;
        }
        return builder.toString();
    }
}
