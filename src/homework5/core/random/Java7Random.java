package homework5.core.random;

import homework5.core.api.IRandom;

import java.util.Random;

//https://stackoverflow.com/questions/363681/how-do-i-generate-random-integers-within-a-specific-range-in-java
public class Java7Random implements IRandom {

    private final Random rand = new Random();

    public int randInt(int min, int max) {
        return rand.nextInt((max - min) + 1) + min;
    }

    @Override
    public double randDouble(double min, double max) {
        return rand.nextDouble() * (max - min) + min;
    }

    @Override
    public String randString(int min, int max) {
        StringBuilder builder = new StringBuilder();
        int stringLength = randInt(min,max);
        char firstLetter = 'а';
        for (int i = 0; i < stringLength; i++) {
            int symbolNumber = firstLetter + rand.nextInt(32);
            char symbol = (char) symbolNumber;
            builder.append(symbol);
        }
        return builder.toString();
    }

    @Override
    public boolean randBoolean() {
        return rand.nextBoolean();
    }
}
