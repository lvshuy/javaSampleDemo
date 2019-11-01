package juc.customer;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AirCondition02 {
    private int number = 0;
    Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();

    public void increase() throws Exception{
        lock.lock();
        try {
            while (number != 0) {
                condition.await();
            }
            number++;
            System.out.println(Thread.currentThread().getName() + "\t" + number);
            condition.signalAll();
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void decrease() throws Exception{
        lock.lock();
        try {
            while (number == 0) {
                condition.await();
            }
            number--;
            System.out.println(Thread.currentThread().getName() + "\t" + number);
            condition.signalAll();
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}

class Test02{
    public static void main(String[] args) {
        AirCondition02 ac = new AirCondition02();

        new Thread(new Runnable() {
            @Override
            public void run(){
                for (int i = 0; i < 10; i++) {
                    try {
                        ac.increase();
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
                        ac.decrease();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        },"B").start();
    }
}