package homework6.dto;

import homework6.dto.api.ITextSpliterator;

public class TextSpliterator implements ITextSpliterator {
    @Override
    public String[] split(String text) {
        return text.split("[^-0-9А-яёЁ]+");
    }
}
