package juc.customer;
/*
* 生产者-消费者
* 生产一个消费一个，交替进行；
*
* 题目：
* 两个线程操作初始值为0的变量
* 实现一个线程对该变量加一，一个线程对该变量减一；
*
* 高内聚低耦合前提下，线程操作资源类
* 判断  干活  通知
* */
public class AirCondition {

    private int number = 0;
    public synchronized void increase() throws Exception{
        while (number!=0){
            this.wait();
        }
        number++;
        System.out.println(Thread.currentThread().getName()+"\t"+number);
        this.notifyAll();
    }
    public synchronized void decrease() throws Exception{
        while (number==0){
            this.wait();
        }
        number--;
        System.out.println(Thread.currentThread().getName()+"\t"+number);
        this.notifyAll();
    }
}

class Test01{
    public static void main(String[] args) throws Exception {

        AirCondition ac = new AirCondition();

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
        },"C").start();
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
        },"D").start();
    }
}
