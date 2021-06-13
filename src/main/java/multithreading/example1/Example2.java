package multithreading.example1;

public class Example2 {

    public static void main() {
        for (int i = 0; i < 10; i++) {
            new HelloThread().start();
        }

        System.out.println("main поток");
    }

    private static class HelloThread extends Thread {

        @Override
        public void run() {
            System.out.println(getName());
        }
    }
}
