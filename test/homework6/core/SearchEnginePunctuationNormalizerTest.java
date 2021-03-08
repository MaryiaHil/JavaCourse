package homework6.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchEnginePunctuationNormalizerTest {
    private final SearchEnginePunctuationNormalizer punctNormSearch =
            new SearchEnginePunctuationNormalizer(new RegExSearch());

    @Test
    public void checkPunctuationNormalizerSearch(){

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

        assertEquals(1, punctNormSearch.search(textSearch, "Я"));
        assertEquals(7, punctNormSearch.search(textSearch,"в"));
        assertEquals(1, punctNormSearch.search(textSearch,"края"));
        assertEquals(1, punctNormSearch.search(textSearch,"краю"));
        assertEquals(0, punctNormSearch.search(textSearch,"Ла"));
        assertEquals(5, punctNormSearch.search(textSearch,"ТуЛуЛа"));
        assertEquals(5, punctNormSearch.search(textSearch,"ТуТуЛуЛа"));
        assertEquals(1, punctNormSearch.search(textSearch,"2"));
    }
}
