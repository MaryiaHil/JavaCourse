package homework5.core;

public class GlobalCounter {
    private int counter;

    public int getCounter() {
        return this.counter;
    }

    public int getAndInc() {
        return this.counter++;
    }
}
