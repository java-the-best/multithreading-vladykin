package multithreading.example5.n2;

public class Singleton {

    private int foo;
    private String bar;

    private Singleton() {
        this.foo = 13;
        this.bar = "zap";
    }

    private volatile static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
