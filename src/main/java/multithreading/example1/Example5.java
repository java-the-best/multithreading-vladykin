package multithreading.example1;

public class Example5 {

    public static void main() {
        HelloRunnable helloRunnable = new HelloRunnable();
        for (int i = 0; i < 10; i++) {
            new Thread(helloRunnable).start();
        }

        System.out.println("main поток");
    }

    private static class HelloRunnable implements Runnable {

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
