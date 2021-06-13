package multithreading.example1;

public class Example4 {

    public static void main() {
        for (int i = 0; i < 10; i++) {
            new Thread(() ->  System.out.println(Thread.currentThread().getName())).start();
        }

        System.out.println("main поток");
    }
}
