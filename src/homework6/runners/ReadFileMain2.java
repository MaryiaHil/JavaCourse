package homework6.runners;

import homework6.dto.TextSpliterator;
import homework6.dto.api.ITextSpliterator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

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
            int counter = data.getOrDefault(word, 0) + 1;
            data.put(word, counter);
        }
        data.remove("--");
        data.remove("-");
        List<Map.Entry<String, Integer>> sortedData = new ArrayList<>(data.entrySet());

        Comparator<Map.Entry<String, Integer>> comparator = new Comparator<>() {
            @Override
            public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
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
