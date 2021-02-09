package homework5.core.random;

import homework5.core.api.IRandom;

import java.util.concurrent.ThreadLocalRandom;

//https://stackoverflow.com/questions/363681/how-do-i-generate-random-integers-within-a-specific-range-in-java
public class Java8Random implements IRandom {
    public int randInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    @Override
    public double randDouble(double min, double max) {
        return ThreadLocalRandom.current().nextDouble() * (max - min) + min;
    }

    @Override
    public String randString(int min, int max) {
        StringBuilder builder = new StringBuilder();
        int stringLength = randInt(min,max);
        char firstLetter = 'а';
        for (int i = 0; i < stringLength; i++) {
            int symbolNumber = firstLetter + ThreadLocalRandom.current().nextInt(32);
            char symbol = (char) symbolNumber;
            builder.append(symbol);
        }
        return builder.toString();
    }

    @Override
    public boolean randBoolean() {
        return ThreadLocalRandom.current().nextBoolean();
    }
}
