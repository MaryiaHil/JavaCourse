package homework6.task7and8;

import homework6.core.api.ISearchEngine;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.BlockingQueue;

public class SearcherTask implements Runnable {
    private final File file;
    private final ISearchEngine searchEngine;
    private final String word;
    private final BlockingQueue<SearchResult> queue;

    public SearcherTask(File file, ISearchEngine searchEngine, String word, BlockingQueue<SearchResult> queue) {
        this.file = file;
        this.searchEngine = searchEngine;
        this.word = word;
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            String content = Files.readString(Paths.get(file.toURI()));
            long count = searchEngine.search(content, word);
            queue.offer(new SearchResult(word, file, count));
        } catch (IOException e) {
            queue.offer(new SearchResult(word, file, 0));
            System.err.println("Не могу прочитать файл " + file.getName());
        }
    }

    public static class SearchResult {
        public final String word;
        public final File file;
        public final long count;

        public SearchResult(String word, File file, long count) {
            this.word = word;
            this.file = file;
            this.count = count;
        }
    }
}
