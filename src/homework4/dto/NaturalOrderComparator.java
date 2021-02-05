package homework4.dto;


import java.util.Comparator;

public class NaturalOrderComparator<T extends Comparable<T>> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        // compare objects which are not null
        if (o1 != null && o2 != null) {
            return o1.compareTo(o2);
            // move null objects to the right
        } else if (o1 == o2) {
            return 0;
        } else if (o1 == null) {
            return 1;
        } else {
            return -1;
        }
    }
}
