package juc.yang03;

import juc.yang01.Ticket;

public class SaleTicket {

    public static void main(String[] args) {//���������

        Ticket ticket = new Ticket();
        // lambda���ʽʵ��
        /*
        * public Thread(Runnable target, String name);����һ���߳�
        *
        * @FunctionalInterface
          public interface Runnable {
             public abstract void run();
          }
        * Runnable ����ʽ�ӿ�
        */
        new Thread(() -> { for (int i = 0; i < 30; i++) ticket.sale(); }, "A").start();
        new Thread(() -> { for (int i = 0; i < 30; i++) ticket.sale(); }, "B").start();
        new Thread(() -> { for (int i = 0; i < 30; i++) ticket.sale(); }, "C").start();
    }
}