package homework6.dto;

import homework6.dto.api.ISearchEngine;

/**
 * 4.1 Написать класс EasySearch. Реализовать поиск используя метод indexOf из класса String.
 * В данной реализации запрещено использовать регулярные выражения в любом виде, для любых задач.
 * Данный класс ищет слова с учётом регистра.
 */
public class EasySearch implements ISearchEngine {

    @Override
    public long search(String text, String word) {
        long counter = 0;
        int index = text.indexOf(word);
        while (index >= 0) {
            int right = index + word.length();
            int left = index - 1;
            if ((left < 0 || notAWord(text.charAt(left))) &&
                    (right >= text.length() || notAWord(text.charAt(right)))) {
                counter++;
            }
            index = text.indexOf(word, index + word.length() + 1);
        }
        return counter;
    }

    private boolean notAWord(char c) {
        return !(c >= 'А' && c <= 'я') && !(c >= '0' && c <= '9') && c != 'ё' && c != 'Ё' && c != '-';
    }
}
