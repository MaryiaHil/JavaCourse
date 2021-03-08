package homework6.runners;

import homework6.core.RegExSearch;
import homework6.core.SearchEnginePunctuationNormalizer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * 4.3* Написать декоратор SearchEnginePunctuationNormalizer для ISearchEngine который будет удалять
 * нежелательные символы. Любые знаки препинания, лишние пробелы и например переводы строк.
 */
public class ReadFileMain5 {
    public static void main(String[] args) throws IOException {
        Path fileName = Path.of("C:\\Users\\Maryia_Hil\\IdeaProjects\\JD1\\HomeWork\\src\\homework6\\" +
                "Война и мир_книга.txt");
        String content = Files.readString(fileName);

        SearchEnginePunctuationNormalizer newSearch = new SearchEnginePunctuationNormalizer(new RegExSearch());

        System.out.println(newSearch.search(content,"как"));

    }

}
