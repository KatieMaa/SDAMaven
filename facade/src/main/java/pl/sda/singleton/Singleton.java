package pl.sda.singleton;

/**
 * Created by RENT on 2017-02-25.
 */
public class Singleton {
    private static Singleton instance = new Singleton();
    private static int counter = 0;

    private Singleton() {
        counter++;
    }

    public static Singleton getInstance() {
        return instance;
    }

    public static int getCounter() {
        return counter;
    }

    public String getName() {
        return "Sinleton";
    }
}
