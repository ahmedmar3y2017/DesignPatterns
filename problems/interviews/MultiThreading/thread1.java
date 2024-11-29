package problems.interviews.MultiThreading;

public class thread1 implements Runnable {
    public void run() {

        System.out.println(
                "Thread startred "
        );
    }

    public static void main(String[] args) {

        new Thread(new thread1()).start();
    }
}
