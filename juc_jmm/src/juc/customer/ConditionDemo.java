package juc.customer;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionDemo {
    private int number = 1;  //标志位 A-1,B-2,C-3
    Lock lock = new ReentrantLock();
    private Condition c1 = lock.newCondition();
    private Condition c2 = lock.newCondition();
    private Condition c3 = lock.newCondition();

    public void print5(){
        lock.lock();
        try {
            // 判断
            while (number != 1) {
                c1.await();
            }
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + "\t" + i);
            }
            // 通知
            number = 2;
            // 如何通知下一个线程？
            c2.signal();
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void print10(){
        lock.lock();
        try {
            while (number != 2) {
                c2.await();
            }
            for (int i = 1; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName() + "\t" + i);
            }
            number = 3;
            c3.signal();
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void print15(){
        lock.lock();
        try {
            while (number != 3) {
                c3.await();
            }
            for (int i = 1; i <= 15; i++) {
                System.out.println(Thread.currentThread().getName() + "\t" + i);
            }
            number = 1;
            // 再通知第一个线程
            c1.signal();
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}

class Test03{
    public static void main(String[] args) {
        ConditionDemo conditionDemo = new ConditionDemo();

        new Thread(new Runnable() {
            @Override
            public void run(){
                for (int i = 0; i < 10; i++) {
                    try {
                        conditionDemo.print5();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        },"A").start();

        new Thread(new Runnable() {
            @Override
            public void run(){
                for (int i = 0; i < 10; i++) {
                    try {
                        conditionDemo.print10();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        },"B").start();
        new Thread(new Runnable() {
            @Override
            public void run(){
                for (int i = 0; i < 10; i++) {
                    try {
                        conditionDemo.print15();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        },"C").start();
    }
}