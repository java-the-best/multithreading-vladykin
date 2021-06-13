package multithreading.example5.n1;

public class Singleton {

    private int foo;
    private String bar;

    private Singleton() {
        this.foo = 13;
        this.bar = "zap";
    }

    private static Singleton instance;

    public synchronized static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
