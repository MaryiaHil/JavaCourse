package homework2.sorts;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SortUtilsTest {


    @ParameterizedTest
    @DisplayName("Пузырьковая сортировка")
    @MethodSource("argumentsProvider")
    public void checkBubbleSort(int[] arr, int[] sortedArr){
        SortUtils.bubbleSort(arr);
        assertArrayEquals(sortedArr, arr);
    }

    @ParameterizedTest
    @DisplayName("Шейкерная сортировка")
    @MethodSource("argumentsProvider")
    public void shakerBubbleSort(int[] arr, int[] sortedArr){
        SortUtils.shakerSort(arr);
        assertArrayEquals(sortedArr, arr);
    }

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                arguments(new int[] {1,2,3,4,5,6}, new int[] {1,2,3,4,5,6}),
                arguments(new int[] {1,1,1,1}, new int[] {1,1,1,1}),
                arguments(new int[] {9,1,5,99,9,9}, new int[] {1,5,9,9,9,99}),
                arguments(new int[] {}, new int[] {}),
                arguments(new int[] {87, 7, 35, 12, 4, 6, 9}, new int[] {4, 6, 7, 9, 12, 35, 87}),
                arguments(new int[] {22, 10, 5, 101, 36}, new int[] {5, 10, 22, 36, 101})
        );
    }
}
