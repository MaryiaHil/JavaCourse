package homework6.core;

import homework6.core.api.ISearchEngine;

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
