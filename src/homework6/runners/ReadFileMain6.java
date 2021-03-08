package homework6.runners;

import homework6.core.EasySearch;
import homework6.core.SearchEngineIgnoreCaseDecorator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * 4.4* Написать декоратор для ISearchEngine который будет позволять искать данные без учёта регистра.
 * 5. Используя реализации интерфейса ISearchEngine вывести информацию как часто встречаются слова
 * "война", "и" (как союз), "мир" вне зависимости от регистра.
 */
public class ReadFileMain6 {
    public static void main(String[] args) throws IOException {
        Path fileName = Path.of("C:\\Users\\Maryia_Hil\\IdeaProjects\\JD1\\HomeWork\\src\\homework6\\" +
                "Война и мир_книга.txt");
        String content = Files.readString(fileName);

        SearchEngineIgnoreCaseDecorator newSearch = new SearchEngineIgnoreCaseDecorator(new EasySearch());

        System.out.println("Слово \"война\" встречается в тексте: " + newSearch.search(content,
                "война") + " раз(а).");
        System.out.println("Слово \"и\" встречается в тексте: " + newSearch.search(content,
                "и") + " раз(а).");
        System.out.println("Слово \"мир\" встречается в тексте: " + newSearch.search(content,
                "мир") + " раз(а).");
        System.out.println("Слово \"как\" встречается в тексте: " + newSearch.search(content,
                "как") + " раз(а).");

    }
}
