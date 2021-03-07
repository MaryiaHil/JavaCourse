package homework6.dto;

import homework6.dto.api.ISearchEngine;

/**
 * 4.3* Написать декоратор SearchEnginePunctuationNormalizer для ISearchEngine который будет удалять
 * нежелательные символы.
 * Любые знаки препинания, лишние пробелы и например переводы строк.
 */
public class SearchEnginePunctuationNormalizer implements ISearchEngine {
    private final ISearchEngine searchEngine;

    public SearchEnginePunctuationNormalizer(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }


    @Override
    public long search(String text, String word) {
        text = text.replaceAll("[^-\\dА-яёЁ]", " ");
        return searchEngine.search(text, word);
    }
}
