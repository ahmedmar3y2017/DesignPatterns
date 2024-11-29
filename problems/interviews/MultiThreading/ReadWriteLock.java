package problems.interviews.MultiThreading;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLock {
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void method1() {
        lock.readLock().lock();
        try {
            // code here
        } finally {
            lock.readLock().unlock();
        }
    }

    public void method2() {
        lock.writeLock().lock();
        try {
            // code here
        } finally {
            lock.writeLock().unlock();
        }
    }

}
