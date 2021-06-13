package multithreading.example1;

public class Example3 {

    public static void main() {
        for (int i = 0; i < 10; i++) {
            new Thread(new HelloRunnable()).start();
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
