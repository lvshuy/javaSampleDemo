package juc.yang01;

public class Sale {
    public static void main(String[] args){//���������

        Ticket ticket = new Ticket();
        // lambda���ʽ
        new Thread(() -> {for (int i = 0; i <30 ; i++) ticket.sale();},"A").start();
        new Thread(() -> {for (int i = 0; i <30 ; i++) ticket.sale();},"B").start();
        new Thread(() -> {for (int i = 0; i <30 ; i++) ticket.sale();},"C").start();

        /*
        // Thread(Runnable target, String name) Allocates a new Thread object.
        // Runnable�ӿڣ��ӿ�Ҳ��һ��������࣬����new��Ҳ���������ڲ��ࡣ
        // ��̬: ���������ָ�������ʵ��;
        new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i <30 ; i++) {
                    ticket.sale();
                }
            }
        }, "A").start();
        // ���̵߳�״̬��NEW �½�, RUNNABLE ����, BLOCKED ����, WAITING �ȴ������ȣ�������ɢ��, TIMED_WAITING �ȴ�����ʱ����, TERMINATED ����;
        // �߳�.start()֮�󲢲����������������ڶ��̵߳ĵ��ȸ��ײ��cpu�йأ�����������߳�ʲôʱ�����С�
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
