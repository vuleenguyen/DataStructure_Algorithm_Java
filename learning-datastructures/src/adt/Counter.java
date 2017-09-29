package adt;

/**
 * Created by Do My Duyen on 9/20/2017.
 */
public class Counter {

    private String name;
    private int count;

    public Counter(String str) {
        this.name = str;
    }

    public void increment() {
        count++;
    }

    public int getCurrentValue() {
        return count;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }
}
