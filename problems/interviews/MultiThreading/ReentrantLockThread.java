package problems.interviews.MultiThreading;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockThread {

    ReentrantLock lock = new ReentrantLock();

    public void lock1() {
        lock.lock();

        try {
            System.out.println("lock  ");
        } finally {
            lock.unlock();
        }

    }

    public void lock2() {
        if (lock.tryLock()) {
            try {
                System.out.println("lock  ");
            } finally {
                lock.unlock();
            }
        } else {

            System.out.println("Un lock  ");
        }

    }
}
