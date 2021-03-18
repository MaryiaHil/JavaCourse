package homework6.task7and8;


import homework6.core.RegExSearch;
import homework6.core.SearchEngineIgnoreCaseDecorator;
import homework6.core.api.ISearchEngine;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * 7. Написать новый класс с точкой входа. При запуске программы пользователь должен передать адрес папки,
 * из которой мы будет считывать текстовые файлы. Наполнить данную директорию книгами, 100 книг мнинимум.
 * При запуске пользователю в консоль выдать список txt файлов и предложить выбрать текст,
 * с которым мы будем работать. Пользователь, выбрав текст вводит то, что он хочет найти в этом тексте.
 * После каждого ввода осуществляется поиск. Вводит пока не надоест.
 * Результат всех его поисков должен накапливаться в файла result.txt в формате «Имя файла – слово – количество»
 */
public class WordSearcherInBooks {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String dirPath = getBookDirectory(scanner);
            Book book = getBook(scanner, dirPath);
            searchWords(scanner, book);
        }
    }

    public static String getBookDirectory(Scanner scanner) {
        System.out.println("Введите путь к директории с книгами:");
        String dirPath = scanner.nextLine();
        File dir = new File(dirPath);
        if (!dir.isDirectory()) {
            throw new IllegalArgumentException("Такой директории нет! Попробуйте еще раз.");
        }
        File[] files = dir.listFiles();
        if (files != null) {
            for (File file1 : files) {
                System.out.println(file1.getName());
            }
        }
        return dirPath;
    }

    private static class Book {
        private final String bookName;
        private final String content;

        public Book(String bookName, String content) {
            this.bookName = bookName;
            this.content = content;
        }
    }

    public static Book getBook(Scanner scanner, String dirPath) {
        System.out.println("Напишите название книги:");
        String bookName = scanner.nextLine();
        String content = null;
        try {
            content = Files.readString(Path.of(dirPath, bookName));
        } catch (IOException e) {
            throw new IllegalArgumentException("Не могу прочитать книгу " + bookName, e);
        }
        return new Book(bookName, content);
    }

    public static void searchWords(Scanner scanner, Book book) {

        ISearchEngine searchEngine = new SearchEngineIgnoreCaseDecorator(new RegExSearch());

        try (FileWriter writer = new FileWriter("result1.txt")) {
            while (true) {
                System.out.println("Напишите слово");
                String word = scanner.nextLine();
                if (word.equals("exit")) {
                    return;
                }
                long searchResult = searchEngine.search(book.content, word);
                writer.write(book.bookName + " - " + word + " - " + searchResult + "\n");
            }
        } catch (IOException e) {
            throw new IllegalArgumentException("Не могу записать результаты в файл", e);
        }
    }
}
