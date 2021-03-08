package homework6.runners;

import homework6.core.RegExSearch;
import homework6.core.api.ISearchEngine;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * 4.2* Написать класс RegExSearch реализующий интерфейс ISearchEngine. Реализовать поиск при помощи класса Matcher.
 * Данный класс ищет слова с учётом регистра.
 */
public class ReadFileMain4 {
    public static void main(String[] args) {

        Path fileName = Path.of("C:\\Users\\Maryia_Hil\\IdeaProjects\\JD1\\HomeWork\\src\\homework6\\" +
                "Война и мир_книга.txt");

        String content = null;

        try {
            content = Files.readString(fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }

        ISearchEngine newSearch = new RegExSearch();

        System.out.println(newSearch.search(content, "как"));

    }

}
