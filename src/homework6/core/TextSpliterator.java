package homework6.core;

import homework6.core.api.ITextSpliterator;

public class TextSpliterator implements ITextSpliterator {
    @Override
    public String[] split(String text) {
        String tempText = text.replaceAll("-|--", "");
        return tempText.split("[^0-9А-яёЁ-]+");
    }
}
