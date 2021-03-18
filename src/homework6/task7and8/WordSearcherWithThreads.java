package homework6.task7and8;

import homework6.core.RegExSearch;
import homework6.core.SearchEngineIgnoreCaseDecorator;
import homework6.core.api.ISearchEngine;
import homework6.task7and8.SearcherTask;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Написать новый класс с точкой входа. При запуске программы пользователь должен передать адрес папки,
 * из которой мы будет считывать текстовые файлы. После запуска пользователь указывает,
 * что он хочет найти в этом тексте. После каждого ввода осуществляется поиск.
 * Вводит пока не надоест. Поиск выполняется многопоточно. Один поток – один файл.
 * Результат всех его поисков должен накапливаться в файл result.txt в формате
 * «Имя файла – слово – количество»
 */
public class WordSearcherWithThreads {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String dirPath = getBookDirectory(scanner);
            searchWord(scanner, dirPath);
        }
    }

    public static String getBookDirectory(Scanner scanner) {
        System.out.println("Введите путь к директории с книгами:");
        String dirPath = scanner.nextLine();
        File dir = new File(dirPath);
        if (!dir.isDirectory()) {
            throw new IllegalArgumentException("Такой директории нет! Попробуйте еще раз.");
        }
        return dirPath;
    }

    public static void searchWord(Scanner scanner, String dirPath) {
        File dir = new File(dirPath);
        File[] files = dir.listFiles();
        final ISearchEngine searchEngine = new SearchEngineIgnoreCaseDecorator(new RegExSearch());
        while (true) {
            System.out.println("Напишите слово");
            String word = scanner.nextLine();
            if (word.equals("exit")) {
                return;
            }

            BlockingQueue<SearcherTask.SearchResult> results = new ArrayBlockingQueue<>(files.length);
            for (File file : files) {
                Thread th = new Thread(new SearcherTask(file, searchEngine, word, results));
                th.setDaemon(true);
                th.start();
            }
            try (FileWriter writer = new FileWriter("result2.txt",true)) {
                for (int i = 0; i < files.length; ++i) {
                    SearcherTask.SearchResult searchResult = results.take();
                    writer.write(String.format("%s - %s - %d\n",
                            searchResult.file.getName(), searchResult.word, searchResult.count));
                }
            } catch (IOException e) {
                throw new IllegalArgumentException("Не могу записать результат", e);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

