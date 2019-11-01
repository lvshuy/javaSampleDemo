package juc.yang03;

import juc.yang01.Ticket;

public class SaleTicket {

    public static void main(String[] args) {//主程序入口

        Ticket ticket = new Ticket();
        // lambda表达式实现
        /*
        * public Thread(Runnable target, String name);创建一个线程
        *
        * @FunctionalInterface
          public interface Runnable {
             public abstract void run();
          }
        * Runnable 函数式接口
        */
        new Thread(() -> { for (int i = 0; i < 30; i++) ticket.sale(); }, "A").start();
        new Thread(() -> { for (int i = 0; i < 30; i++) ticket.sale(); }, "B").start();
        new Thread(() -> { for (int i = 0; i < 30; i++) ticket.sale(); }, "C").start();
    }
}