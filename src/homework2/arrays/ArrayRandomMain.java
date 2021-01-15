package homework2.arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * 2.3 Написать метод public static int[] arrayRandom(int size, int maxValueExclusion) рядом с main.
 * Данный метод принимает два аргумента. Первый (size) указывает размер массива который мы хотим получить.
 * Второй (maxValueExclusion) указывает до какого числа генерировать рандомные числа.
 * Пример: int[] container = arrayRandom(5, 100).
 * Результат: В методе arrayRandom будет создан массив размером 5 с числами от 0 до 99
 * (использовать класс Random) и сохранён в переменную container.
 */
public class ArrayRandomMain {

    public static void main(String[] args) {
        int[] newArr = arrayRandom(5, 100);
        System.out.println(Arrays.toString(newArr));
    }

    public static int[] arrayRandom(int size, int maxValueExclusion){
        int[] container = new int[size];
        Random random = new Random();
        for (int i = 0; i < container.length; i++) {
            int value = random.nextInt(maxValueExclusion);
            container[i] = value;
        }
        return container;
    }
}
