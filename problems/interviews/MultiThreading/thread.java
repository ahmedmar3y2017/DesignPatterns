package problems.interviews.MultiThreading;

public class thread extends Thread {

    @Override
    public void run() {

        System.out.println("Start Thread ");
    }

    public static void main(String[] args) {
        thread t1 = new thread();
        t1.start();

    }

}
