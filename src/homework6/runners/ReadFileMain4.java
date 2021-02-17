package homework6.runners;

import homework6.dto.RegExSearch;
import homework6.dto.api.ISearchEngine;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * 4.2* Написать класс RegExSearch реализующий интерфейс ISearchEngine. Реализовать поиск при помощи класса Matcher.
 * Данный класс ищет слова с учётом регистра.
 */
public class ReadFileMain4 {
    public static void main(String[] args) throws IOException {
        Path fileName = Path.of("C:\\Users\\Maryia_Hil\\IdeaProjects\\JD1\\HomeWork\\src\\homework6\\" +
                "Война и мир_книга.txt");
        String content = Files.readString(fileName);

        ISearchEngine newSearch = new RegExSearch();

        System.out.println(newSearch.search(content, "и"));

    }

}
