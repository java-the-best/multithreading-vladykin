package multithreading.example1;

public class Example1 {

    public static void main() {
        Thread thread = new NewThread();
        thread.start();

        Thread thread2 = new Thread() {
            @Override
            public void run() {
                System.out.println("поток 2");
            }
        };
        thread2.start();

        Runnable runnable = () -> System.out.println("поток 3");
        Thread thread3 = new Thread(runnable);
        thread3.start();
    }

    private static class NewThread extends Thread {

        @Override
        public void run() {
            System.out.println("поток 1");
        }
    }
}
