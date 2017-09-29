package ds.queue;

/**
 * Created by Do My Duyen on 9/21/2017.
 */
public class App {

    public static void main(String[] args) {
        Queue myQueue = new Queue(10);
        myQueue.insert(10);
        myQueue.insert(7);
        myQueue.insert(9);
        myQueue.insert(8);
        myQueue.insert(6);
        myQueue.view();
    }
}
