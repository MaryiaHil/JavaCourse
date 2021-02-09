package homework5.core.api;

public interface IRandom {
    /**
     * Возвращает радном int в заданном промежутке
     *
     * @param min с
     * @param max по
     * @return рандомное число
     */
    int randInt(int min, int max);

    /**
     * Возвращает радном double в заданном промежутке
     *
     * @param min с
     * @param max по
     * @return рандомное число
     */
    double randDouble(double min, double max);

    /**
     * Возвращает радном String с указанным количеством символов
     *
     * @param min минимальное количество символов
     * @param max максимальное количество символов
     * @return рандомная строка
     */
    String randString(int min, int max);

    /**
     * Возвращает радном boolean
     *
     * @return рандомное значение
     */
    boolean randBoolean();
}
