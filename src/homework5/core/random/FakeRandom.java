package homework5.core.random;

import homework5.core.api.IRandom;

public class FakeRandom implements IRandom {
    @Override
    public int randInt(int min, int max) {
        return 12;
    }

    @Override
    public double randDouble(double min, double max) {
        return 9.0;
    }

    @Override
    public String randString(int min, int max) {
        return "Привет";
    }

    @Override
    public boolean randBoolean() {
        return false;
    }
}
