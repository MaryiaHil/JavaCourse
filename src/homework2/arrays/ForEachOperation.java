package homework2.arrays;

import homework2.arrays.api.IArraysOperation;

public class ForEachOperation implements IArraysOperation {
    @Override
    public String allArrayElements(int[] arr) {
        StringBuilder builder = new StringBuilder();
        for (int value : arr) {
            builder.append (value).append(" ");
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
        int[] revArr = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            revArr[j] = arr[i];
            j++;
        }
        for (int value : revArr) {
            builder.append (value).append(" ");
        }
        return builder.toString();
    }
}
