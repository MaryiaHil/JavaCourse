package homework6.runners;

import homework6.core.TextSpliterator;
import homework6.core.api.ITextSpliterator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;

/**
 * 2.1 Найти в тексте все использованные слова и поместить их в коллекцию Set.
 */
public class ReadFileMain1 {
    public static void main(String[] args) {

        Path fileName = Path.of("C:\\Users\\Maryia_Hil\\IdeaProjects\\JD1\\HomeWork\\src\\" +
                "homework6\\Война и мир_книга.txt");
        String content = null;
        try {
            content = Files.readString(fileName);
        } catch(IOException e){
            System.out.println(e.getMessage());
            return;
        }

        ITextSpliterator spliterator = new TextSpliterator();
        String[] words = spliterator.split(content);

        Set<String> uniqueWord = new HashSet<>();

        for (String word : words) {
            uniqueWord.add(word.toLowerCase());
        }

        System.out.println("Количество уникальных слов: " + uniqueWord.size());
    }
}
