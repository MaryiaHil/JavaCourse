package homework6.runners;

import homework6.core.TextSpliterator;
import homework6.core.api.ITextSpliterator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.Map.Entry;

/**
 * 2.2 Найти в тексте топ N (настраиваемое значение) слов и вывести количество этих слов используя Map и List.
 * Отсортировать по количеству. Распечатать в консоль.
 */
public class ReadFileMain2 {
    public static void main(String[] args) throws IOException {
        Path fileName = Path.of("C:\\Users\\Maryia_Hil\\IdeaProjects\\JD1\\HomeWork\\src\\homework6\\" +
                "Война и мир_книга.txt");
        String content = Files.readString(fileName);

        ITextSpliterator spliterator = new TextSpliterator();
        String[] words = spliterator.split(content);

        Map<String, Integer> data = new HashMap<>();

        for (String word : words) {
            word = word.toLowerCase();
            int counter = data.getOrDefault(word, 0) + 1;
            data.put(word, counter);
        }

        Set<Entry<String, Integer>> entries = data.entrySet();
        List<Entry<String, Integer>> sortedData = new ArrayList<>(entries);

        Comparator<Entry<String, Integer>> comparator = new Comparator<>() {
            @Override
            public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2) {
                return Integer.compare(e1.getValue(), e2.getValue());
            }
        };

        sortedData.sort(comparator.reversed());

        printTopN(sortedData, 20);
    }

    public static <E> void printTopN(List<E> list, int number) {
        if (list.size() < number) {
            for (E e : list) {
                System.out.println(e);
            }
        } else {
            for (int i = 0; i < number; i++) {
                System.out.println(list.get(i));
            }
        }
    }

}
