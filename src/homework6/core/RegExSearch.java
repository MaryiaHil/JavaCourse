package homework6.core;

import homework6.core.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 4.2* Написать класс RegExSearch реализующий интерфейс ISearchEngine.
 * Реализовать поиск при помощи класса Matcher. Данный класс ищет слова с учётом регистра.
 */
public class RegExSearch implements ISearchEngine {

    @Override
    public long search(String text, String word) {
        String tempText = " " + text;
        long counter = 0;
        String wordRegex = "[^-\\dА-яёЁ]+" + word + "[^-\\dА-яёЁ]+";
        Pattern pattern = Pattern.compile(wordRegex);
        Matcher matcher = pattern.matcher(tempText);
        while (matcher.find()) {
            counter++;
        }
        return counter;
    }

}
