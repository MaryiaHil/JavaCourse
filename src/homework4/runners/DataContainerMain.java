package homework4.runners;

import homework4.dto.DataContainer;
import homework4.dto.NaturalOrderComparator;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainerMain {
    public static void main(String[] args) {
        Integer[] data1 = {90, null, 3, 33, 87, 10, null, null, null};
        String[] data2 = {"abc", "Dgh", "N", "ok", "as"};
        Integer[] data3 = {null, 93, 8, 11, 10, null, 19, 77};
        DataContainer<Integer> container1 = new DataContainer<>(data1);
        DataContainer<String> container2 = new DataContainer<>(data2);
        DataContainer<Integer> container3 = new DataContainer<>(data3);
        Comparator<Integer> naturalComparator = new NaturalOrderComparator<>();

        // Tests for int add(T item) method
        int index1 = container1.add(1);
        int index2 = container1.add(56);
        System.out.println("The position of the inserted element is " + index1);
        System.out.println("The position of the inserted element is " + container1.add(null));
        System.out.println("The position of the inserted element is " + index2);

        // Tests for T get(int index) method
        System.out.println("The value of the requested position is " + container1.get(index2));
        System.out.println("The value of the requested position is " + container1.get(10));

        // Test for T[] getItems() method
        Integer[] newData = container1.getItems();
        System.out.println("The modified  data1 array: " + Arrays.toString(newData));

        // Tests for boolean delete(int index) method
        System.out.println("The value was removed: " + container1.delete(index1));
        System.out.println("The value was removed: " + container1.delete(7));
        System.out.println("The modified data1 array: " + Arrays.toString(container1.getItems()));

        // Tests for boolean delete(T item) method
        System.out.println("The value was removed: " + container1.delete((Integer) 33));
        System.out.println("The value was removed: " + container1.delete((Integer) 156));
        System.out.println("The value was removed: " + container1.delete(null));
        System.out.println("The modified data1 array: " + Arrays.toString(container1.getItems()));

        // Test for the overridden toString() method
        System.out.println("The data1 array without null values: " + container1.toString());

        // Test for void sort(Comparator<? super T> comparator) method
        container1.sort(naturalComparator);
        Integer[] sortedData1 = container1.getItems();
        System.out.println("The sorted data1 array " + Arrays.toString(sortedData1));

        // Test for static void sort(DataContainer<? extends Comparable<?>> container) method
        DataContainer.sort(container2);
        String[] sortedData2 = container2.getItems();
        System.out.println("The sorted data2 array " + Arrays.toString(sortedData2));

        // Test for static <E> void sort(DataContainer<E> container, Comparator<? super E> comparator)
        DataContainer.sort(container3, naturalComparator);
        Integer[] sortedData3 = container3.getItems();
        System.out.println("The sorted data3 array " + Arrays.toString(sortedData3));
    }
}
