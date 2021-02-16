package homework6;

import homework6.dto.EasySearch;
import homework6.dto.api.ISearchEngine;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * 4.1 Написать класс EasySearch. Реализовать поиск используя метод indexOf из класса String.
 * В данной реализации запрещено использовать регулярные выражения в любом виде, для любых задач.
 * Данный класс ищет слова с учётом регистра
 */
public class ReadFileMain3 {
    public static void main(String[] args) throws IOException {
        Path fileName = Path.of("C:\\Users\\Maryia_Hil\\IdeaProjects\\JD1\\HomeWork\\src\\homework6\\" +
                "Война и мир_книга.txt");
        String content = Files.readString(fileName);

        ISearchEngine newSearch = new EasySearch();

        System.out.println(newSearch.search(content, "как"));

    }

}
