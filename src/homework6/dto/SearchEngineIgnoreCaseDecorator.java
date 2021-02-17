package homework6.dto;

import homework6.dto.api.ISearchEngine;

import java.util.Locale;

/**
 * 4.4* Написать декоратор для ISearchEngine который будет позволять искать данные без учёта регистра.
 */
public class SearchEngineIgnoreCaseDecorator implements ISearchEngine {
    private final ISearchEngine searchEngine;

    public SearchEngineIgnoreCaseDecorator(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    @Override
    public long search(String text, String word) {
        text = text.toLowerCase();
        word = word.toLowerCase();
        return searchEngine.search(text, word);
    }
}
