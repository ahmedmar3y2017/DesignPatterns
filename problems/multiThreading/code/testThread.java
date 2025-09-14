package problems.multiThreading.code;

public class testThread {
    public static class Waiter extends Thread {
        Object lock;

        Waiter(Object o) {
            lock = o;
        }

        @Override
        public void run() {

            synchronized (lock) {
                try {
                    System.out.println("Waiter started");
                    lock.wait(2000);
                    System.out.println("Notify Waiter finished");
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }

        }
    }

    public static class Cheif extends Thread {
        Object lock;

        Cheif(Object o) {
            lock = o;
        }

        @Override
        public void run() {
            try {
                System.out.println("Cheif started");
                Thread.sleep(5000); // eaiting until order ready
                synchronized (lock) {
                    lock.notify();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

        }
    }

    public static void main(String[] args) {

        Object order = new Object();

        Waiter waiter = new Waiter(order);

        Cheif cheif=new Cheif(order);

        waiter.start();
        cheif.start();


    }
}
