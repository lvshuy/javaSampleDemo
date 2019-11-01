package juc.yang01;

public class Sale {
    public static void main(String[] args){//主程序入口

        Ticket ticket = new Ticket();
        // lambda表达式
        new Thread(() -> {for (int i = 0; i <30 ; i++) ticket.sale();},"A").start();
        new Thread(() -> {for (int i = 0; i <30 ; i++) ticket.sale();},"B").start();
        new Thread(() -> {for (int i = 0; i <30 ; i++) ticket.sale();},"C").start();

        /*
        // Thread(Runnable target, String name) Allocates a new Thread object.
        // Runnable接口：接口也是一种特殊的类，可以new，也就是匿名内部类。
        // 多态: 父类的引用指向子类的实例;
        new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i <30 ; i++) {
                    ticket.sale();
                }
            }
        }, "A").start();
        // 多线程的状态：NEW 新建, RUNNABLE 运行, BLOCKED 阻塞, WAITING 等待（死等，不见不散）, TIMED_WAITING 等待（过时不候）, TERMINATED 结束;
        // 线程.start()之后并不是马上启动，由于多线程的调度跟底层的cpu有关，并不清楚该线程什么时候运行。
        new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i <30 ; i++) {
                    ticket.sale();
                }
            }
        }, "B").start();

        new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i <30 ; i++) {
                    ticket.sale();
                }
            }
        }, "C").start();
        */
    }
}
