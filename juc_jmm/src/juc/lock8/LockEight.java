package juc.lock8;

import static java.lang.Thread.*;

/*
* synchronized�ؼ���
* �ܹ���֤��ͬһʱ�����ֻ��һ���߳�ִ�иöδ��룬�Դﵽ��֤���̲߳�����ȫ��Ч��
*
1. �����߳�ͬʱ����**ͬһ����**�Ĳ�ͬͬ������  -->  ��������
====sedEmail====
====sedSMS====
2. �����߳�ͬʱ����**��������**��ͬ������  -->   �ֱ�������������this��
====sedSMS====
====sedEmail====
3. �����߳��������ͬһ���������ͨͬ������ --> ͬ���������У���Ϊʹ�õ�this��ͬһ������
====sedEmail====
====sedSMS====
4. �����߳�ͬʱ����ͬһ���������ͨͬ������ --> ���������ĸ��߳����õ������ĸ���ִ�У�
====���ز�ȷ��====
5. �����̷߳��ʵ���synchronized��**��̬**����  --> ������Class��
====sedEmail====
====sedSMS====
6. �����߳�ͬʱ����**ͬ������**��**��ͬ������** --> ����ͬ�������Ƿ�Ϊ��̬�ģ���ͬ������������Ӱ�죻
====hello====
====sedEmail====
7. �����߳�ͬʱ����**��̬**synchronized������**�Ǿ�̬**synchronized����  -->  ������ͬ����������Ӱ�죻
====sedSMS====
====sedEmail====
8. �����׳�**�쳣**�󣬻�**�ͷ���**  -->
* */
class Phone{
    public static synchronized void sendEmail() throws InterruptedException {
        sleep(2000);
        System.out.println("====sedEmail====");
//        System.out.println(Thread.currentThread().getName()+"====sedEmail====");
    }
    public synchronized void sendSMS(){
        System.out.println("====sedSMS====");
    }
    public void sayHello(){
        System.out.println("====hello====");
    }
}
public class LockEight {
    public static void main(String[] args) throws Exception{
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();

        new Thread(new Runnable(){
            @Override
            public void run() {
                try {
                    phone1.sendEmail();
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        },"A").start();

//        sleep(2000);

        new Thread(new Runnable(){
            @Override
            public void run() {
                phone1.sendSMS();
//                phone2.sendSMS();
//                phone1.sayHello();
            }
        }, "B").start();
    }
}
