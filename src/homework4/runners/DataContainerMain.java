package homework4.runners;

import homework4.dto.DataContainer;
import homework4.dto.NaturalOrderComparator;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainerMain {
    public static void main(String[] args) {
        Integer[] data = {90, null, 3, 33, 87, 10, null, null, null};
        DataContainer<Integer> container = new DataContainer<>(data);

        // Tests for int add(T item) method
        int index1 = container.add(1);
        int index2 = container.add(56);
        System.out.println("The position of the inserted element is " + index1);
        System.out.println("The position of the inserted element is " + container.add(null));
        System.out.println("The position of the inserted element is " + index2);

        // Tests for T get(int index) method
        System.out.println("The value of the requested position is " + container.get(index2));
        System.out.println("The value of the requested position is " + container.get(10));

        // Test for T[] getItems() method
        Integer[] newData = container.getItems();
        System.out.println("The modified  data array: " + Arrays.toString(newData));

        // Tests for boolean delete(int index) method
        System.out.println("The value was removed: " + container.delete(index1));
        System.out.println("The value was removed: " + container.delete(7));
        System.out.println("The modified data array: " + Arrays.toString(container.getItems()));

        // Tests for boolean delete(T item) method
        System.out.println("The value was removed: " + container.delete((Integer) 33));
        System.out.println("The value was removed: " + container.delete((Integer) 156));
        System.out.println("The value was removed: " + container.delete(null));
        System.out.println("The modified data array: " + Arrays.toString(container.getItems()));

        // Test for the overridden toString() method
        System.out.println("The data array without null values: " + container.toString());

        // Test for void sort(Comparator<? super T> comparator method
        Comparator<Integer> naturalComparator = new NaturalOrderComparator<>();
        container.sort(naturalComparator);
        Integer[] sortedData = container.getItems();
        System.out.println("The sorted data array " + Arrays.toString(sortedData));
    }
}
