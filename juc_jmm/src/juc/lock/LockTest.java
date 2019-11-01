package juc.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {
    // method1和method2两个方法等价
    public synchronized void method1(){
        System.out.println("我是Synchronized形式的锁");
    }

    Lock lock = new ReentrantLock();
    public void method2(){
        // 锁住
        lock.lock();
        try {
            System.out.println("我是lock形式的锁");
        }finally {
            lock.unlock();
        }
    }
}