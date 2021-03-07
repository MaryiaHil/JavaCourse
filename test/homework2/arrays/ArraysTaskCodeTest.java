package homework2.arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArraysTaskCodeTest {

    @Test
    @DisplayName("Сумма четных положительных элементов массива")
    public void checkPositiveEvenNumbers() {
        assertEquals(24, ArraysTaskCode.checkPositiveEvenNumbers(new int[]{14, 65, 3, 9, 17, 4, 6, 5}));
        assertEquals(38, ArraysTaskCode.checkPositiveEvenNumbers(new int[]{2, 4, 7, 10, 22, 0, 5}));
        assertEquals(0, ArraysTaskCode.checkPositiveEvenNumbers(new int[]{-1, -2, -3}));
        assertEquals(0, ArraysTaskCode.checkPositiveEvenNumbers(new int[]{0}));
    }

    @Test
    @DisplayName("Максимальный из элементов массива с четными индексами")
    public void checkFindMaxElement() {
        assertEquals(17, ArraysTaskCode.findMaxElement(new int[]{14, 65, 3, 9, 17, 4, 6, 5}));
        assertEquals(5, ArraysTaskCode.findMaxElement(new int[]{-67, 2, 5, 54}));
        assertEquals(-3, ArraysTaskCode.findMaxElement(new int[]{-14, -65, -3, -9, -17}));
        assertEquals(0, ArraysTaskCode.findMaxElement(new int[]{0}));
    }

    @Test
    @DisplayName("Элементы массива, которые меньше среднего арифметического")
    public void checkLessThanAverage() {
        assertEquals("14 3 9 4 6 5 ", ArraysTaskCode.lessThanAverage(new int[]{14, 65, 3, 9, 17, 4, 6, 5}));
        assertEquals("-67 ", ArraysTaskCode.lessThanAverage(new int[]{-67, 2, 5, 54}));
        assertEquals("", ArraysTaskCode.lessThanAverage(new int[]{0}));
    }

    @Test
    @DisplayName("Найти два наименьших элемента массива")
    public void checkFindTwoMinElements() {
        assertArrayEquals(new int[]{3, 4}, ArraysTaskCode.findTwoMinElements(new int[]{14, 65, 3, 9, 17, 4, 6, 5}));
        assertArrayEquals(new int[]{0, 0},
                ArraysTaskCode.findTwoMinElements(new int[]{0, 0, 0, 777, 143, 499, 200, 105}));
        assertArrayEquals(null, ArraysTaskCode.findTwoMinElements(new int[]{1}));
        assertArrayEquals(new int[]{-67, 2}, ArraysTaskCode.findTwoMinElements(new int[]{-67, 2, 5, 54}));
    }

    @Test
    @DisplayName("Сжать массив")
    public void checkShrinkArray() {
        ArraysTaskCode.shrinkArray(new int[] {14, 65, 3, 9, 17, 4, 6, 5}, 5, 9);
        assertArrayEquals(new int[] {14, 65, 3, 9, 17, 4, 6, 5}, new int[] {14, 65, 3, 9, 17, 4, 6, 5});
        ArraysTaskCode.shrinkArray(new int[] {0}, 5, 9);
        assertArrayEquals(new int[] {0}, new int[] {0});
        ArraysTaskCode.shrinkArray(new int[] {0, 1}, 6, 2);
        assertArrayEquals(new int[] {0, 1}, new int[] {0, 1});
    }

    @Test
    @DisplayName("Сумма цифр массива")
    public void checkSumArrayDigits() {
        assertEquals(51, ArraysTaskCode.sumArrayDigits(new int[] {14, 65, 3, 9, 17, 4, 6, 5}));
        assertEquals(16, ArraysTaskCode.sumArrayDigits(new int[] {-67, 2, 5, 54}));
        assertEquals(0, ArraysTaskCode.sumArrayDigits(new int[] {0}));
    }
}