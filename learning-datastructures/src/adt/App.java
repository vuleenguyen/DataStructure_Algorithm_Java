package adt;

/**
 * Created by Do My Duyen on 9/20/2017.
 */
public class App {

    public static void main(String[] args) {
        Counter counter = new Counter("myCounter");
        counter.increment();

        counter.increment();
        counter.increment();
        counter.increment();

        System.out.println(counter.getCurrentValue());
    }
}
