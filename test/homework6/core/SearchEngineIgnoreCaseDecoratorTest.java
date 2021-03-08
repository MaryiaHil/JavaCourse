package homework6.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchEngineIgnoreCaseDecoratorTest {

    private final SearchEngineIgnoreCaseDecorator ignoreCaseSearch =
            new SearchEngineIgnoreCaseDecorator(new RegExSearch());

    @Test
    public void checkPunctuationNormalizerSearch() {

        String textSearch = "Я стою на краю, на обрыве над рекой.\n" +
                "Не могу пошевелить ни рукой, ни головой.\n" +
                "Защемило в сердце мне,в голове замкнуло.\n" +
                "Мне осталось только петь\n" +
                "То, что ветром в голову надуло.\n" +
                "Ту-ЛуЛа, Ту-Лу-Лу-Ла!.Ту-Ту-Лу-Ла.\n" +
                "В голове моей замкнуло. Ла-а.\n" +
                "ту-Лу-Ла, :Ту-Лу-Лу-Ла -Ту-Ту-Лу-Ла.\n" +
                "Ветром в голову надуло. Ла-Ла-Ла.\n" +
                "Ты ушёл от меня, к рыжей женщине хромой.\n" +
                "Моя мама запретила возвращаться мне домой.\n" +
                "Моя левая нога с края соскользнула.\n" +
                "Мне осталось только петь\n" +
                "То, что ветром в голову надуло.\n" +
                "Ту-Лу-Ла, Ту-Лу-Лу-ЛаТу-Ту-Лу-Ла.\n" +
                "В голове моей замкнуло. Ла-а.\n" +
                "Ту-Лу-Ла, Ту-Лу-Лу-Ла;Ту-Ту-Лу-Ла.\n" +
                "Ветром в голову надуло. Ла-Ла-Ла.\n" +
                "Ту-Лу-Ла, Ту-Лу-Лу-Ла, Ту-Ту-Лу-Ла.\n" +
                "В голове моей замкнуло. Ла-а.\n" +
                "Ту-Лу-Ла, Ту-Лу-Лу-Ла, Ту-Ту-Лу-Ла.\n" +
                "Ветром в голову надуло. Ла-Ла-Ла. Один, два три.1,2,3.12";

        assertEquals(1, ignoreCaseSearch.search(textSearch, "Я"));
        assertEquals(10, ignoreCaseSearch.search(textSearch,"в"));
        assertEquals(1, ignoreCaseSearch.search(textSearch,"края"));
        assertEquals(1, ignoreCaseSearch.search(textSearch,"краю"));
        assertEquals(0, ignoreCaseSearch.search(textSearch,"-Ла"));
        assertEquals(5, ignoreCaseSearch.search(textSearch,"Ту-Лу-Ла"));
        assertEquals(4, ignoreCaseSearch.search(textSearch,"Ту-Ту-Лу-Ла"));
        assertEquals(1, ignoreCaseSearch.search(textSearch,"Ту-ЛуЛа"));
        assertEquals(1, ignoreCaseSearch.search(textSearch,"2"));
    }
}
