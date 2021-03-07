package homework2.arrays;

import homework2.arrays.api.IArraysOperation;

public class DoWhileOperation implements IArraysOperation {
    @Override
    public String allArrayElements(int[] arr) {
        int i = 0;
        StringBuilder builder = new StringBuilder();
        do {
            builder.append (arr[i]).append(" ");
            i++;
        } while (i < arr.length);
        return builder.toString();
    }

    @Override
    public String eachSecondElement(int[] arr) {
        int i = 1;
        StringBuilder builder = new StringBuilder();
        do {
            builder.append (arr[i]).append(" ");
            i += 2;
        } while (i < arr.length);
        return builder.toString();
    }

    @Override
    public String reverseOrderArray(int[] arr) {
        int i = arr.length - 1;
        StringBuilder builder = new StringBuilder();
        do {
            builder.append (arr[i]).append(" ");
            i--;
        } while (i >= 0);
        return builder.toString();
    }
}
