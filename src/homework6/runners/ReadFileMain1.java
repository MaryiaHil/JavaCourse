package homework6.runners;

import homework6.dto.TextSpliterator;
import homework6.dto.api.ITextSpliterator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;

/**
 * 2.1 Найти в тексте все использованные слова и поместить их в коллекцию Set.
 */
public class ReadFileMain1 {
    public static void main(String[] args) throws IOException {
        Path fileName = Path.of("C:\\Users\\Maryia_Hil\\IdeaProjects\\JD1\\HomeWork\\src\\" +
                "homework6\\Война и мир_книга.txt");
        String content = Files.readString(fileName);

        ITextSpliterator spliterator = new TextSpliterator();
        String[] words = spliterator.split(content);

        Set<String> uniqueWord = new HashSet<>();

        for (String word : words) {
            uniqueWord.add(word.toLowerCase());
        }
        uniqueWord.remove("--");
        uniqueWord.remove("-");
        System.out.println(uniqueWord.toString());
        System.out.println("Количество уникальных слов: " + uniqueWord.size());
    }
}
