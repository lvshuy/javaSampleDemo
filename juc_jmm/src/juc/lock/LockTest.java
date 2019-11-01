package juc.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {
    // method1��method2���������ȼ�
    public synchronized void method1(){
        System.out.println("����Synchronized��ʽ����");
    }

    Lock lock = new ReentrantLock();
    public void method2(){
        // ��ס
        lock.lock();
        try {
            System.out.println("����lock��ʽ����");
        }finally {
            lock.unlock();
        }
    }
}