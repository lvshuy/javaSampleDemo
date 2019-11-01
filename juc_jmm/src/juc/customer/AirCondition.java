package juc.customer;
/*
* ������-������
* ����һ������һ����������У�
*
* ��Ŀ��
* �����̲߳�����ʼֵΪ0�ı���
* ʵ��һ���̶߳Ըñ�����һ��һ���̶߳Ըñ�����һ��
*
* ���ھ۵����ǰ���£��̲߳�����Դ��
* �ж�  �ɻ�  ֪ͨ
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
