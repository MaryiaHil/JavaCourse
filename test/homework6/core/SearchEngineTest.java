package homework6.core;

import homework6.core.api.ISearchEngine;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SearchEngineTest {

    @ParameterizedTest
    @MethodSource("searchProvider")
    public void checkSearch(ISearchEngine searchEngine) {

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

        assertEquals(1, searchEngine.search(textSearch, "Я"));
        assertEquals(7, searchEngine.search(textSearch,"в"));
        assertEquals(1, searchEngine.search(textSearch,"края"));
        assertEquals(1, searchEngine.search(textSearch,"краю"));
        assertEquals(0, searchEngine.search(textSearch,"-Ла"));
        assertEquals(4, searchEngine.search(textSearch,"Ту-Лу-Ла"));
        assertEquals(4, searchEngine.search(textSearch,"Ту-Ту-Лу-Ла"));
        assertEquals(1, searchEngine.search(textSearch,"Ту-ЛуЛа"));
        assertEquals(1, searchEngine.search(textSearch,"2"));
    }

    static Stream<Arguments> searchProvider() {
        return Stream.of(
                arguments(new EasySearch()),
                arguments(new RegExSearch())
        );
    }
}
