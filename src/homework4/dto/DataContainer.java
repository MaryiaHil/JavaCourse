package homework4.dto;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class DataContainer<T> {
    private T[] data;

    public DataContainer(T[] data) {
        this.data = data;
    }

    /**
     * Adds an element(item) in the data array. It doesn't add an element if it's null.
     * If there is no empty element in the initial array,
     * it creates a new one with the new item in the end.
     *
     * @param item to be added
     * @return the index(position) of the inserted item in the data array
     */
    public int add(T item) {
        if (item == null) {
            return -1;
        }
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = item;
                return i;
            }
        }
        int newLength = data.length + 1;
        data = Arrays.copyOf(data, newLength);
        data[newLength - 1] = item;
        return newLength - 1;
    }

    /**
     * Gets an item by index from the data array.
     *
     * @param index is used for finding an item.
     * @return an item
     */
    public T get(int index) {
        if (index < 0 || index > data.length - 1) {
            return null;
        } else {
            return data[index];
        }
    }

    /**
     * Gets the data array from a container object.
     *
     * @return data
     */
    public T[] getItems() {
        return data;
    }

    /**
     * Deletes an item by index from the data, only if this index exists in the data array.
     *
     * @param index is used for finding an item.
     * @return true - if an item was successfully deleted, false - if it wasn't deleted,
     * because the index was wrong (doesn't exist).
     */
    public boolean delete(int index) {
        if (index >= 0 && index < data.length - 1) {
            for (int i = index + 1; i < data.length; i++) {
                data[i - 1] = data[i];
            }
            data = Arrays.copyOf(data, data.length - 1);
            return true;
        }
        return false;
    }

    /**
     * Deletes an item (which can also be null) from the data array.
     *
     * @param item is supposed to be deleted
     * @return true - if an item was successfully deleted, false - if it wasn't deleted,
     * because there was no such an element.
     */
    public boolean delete(T item) {
        for (int i = 0; i < data.length; i++) {
            // compare by reference to be able to delete null elements and the same objects
            if (item == data[i]) {
                return delete(i);
                // compare by content to delete equal values
            } else if (item != null && item.equals(data[i])) {
                return delete(i);
            }
        }
        return false;
    }

    /**
     * Sorts the elements from the data using an object of a Comparator class.
     *
     * @param comparator - the object of Comparator.
     */
    public void sort(Comparator<? super T> comparator) {
        Arrays.sort(data, comparator);
    }

    /**
     * Overrides toString method in order to get the contents (String) of the data without
     * the elements, which are null.
     *
     * @return String - the data contents without null elements
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (T datum : data) {
            if (datum != null)
                builder.append(datum).append(" ");
        }
        return builder.toString().trim();
    }

    /**
     * Sorts the elements from an object of the DataContainer class (the method is static,
     * so it should be called on the class).
     * The object should be of the type which implements the interface Comparable (e.g. Integer).
     *
     * @param container - an instance of the class DataContainer.
     */
    public static void sort(DataContainer<? extends Comparable<?>> container) {
        Arrays.sort(container.data);
    }

    /**
     * Sorts the elements from an object of the DataContainer class, using a comparator
     * (the method is static, so it should be called on the class).
     * <? super E> for a comparator means that we can also pass a comparator of the parent type
     *
     * @param container  - an instance of the class DataContainer
     * @param comparator - an instance of the class comparator, which implements the interface Comparator
     * @param <E>        - a type of data in an object of the class DataContainer
     */
    public static <E> void sort(DataContainer<E> container,
                                Comparator<? super E> comparator) {
        Arrays.sort(container.data, comparator);
    }
}

