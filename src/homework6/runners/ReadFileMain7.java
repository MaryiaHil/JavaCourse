package homework6.runners;


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
public class ReadFileMain7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите путь к директории с книгами:");
        String dirPath = scanner.nextLine();
        File dir = new File(dirPath);
        String bookName = null;
        if (!dir.isDirectory()) {
            System.out.println("Такой директории нет! Попробуйте еще раз.");
        } else {
            File[] files = dir.listFiles();
            if (files != null) {
                for (File file1 : files) {
                    System.out.println(file1.getName());
                }
            }
            System.out.println("Напишите название книги:");
            bookName = scanner.nextLine();
            try {
                String content = Files.readString(Path.of(dirPath, bookName));
                ISearchEngine searchEngine = new SearchEngineIgnoreCaseDecorator(new RegExSearch());
                try (FileWriter writer = new FileWriter("result.txt")) {
                    while (true) {
                        System.out.println("Напишите слово");
                        String word = scanner.nextLine();
                        if (word.equals("exit")) {
                            return;
                        }
                        long searchResult = searchEngine.search(content, word);
                        System.out.println("Встречается в тексте: " + searchResult);
                        writer.write(bookName + " - " + word + " - " + searchResult + "\n");
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
