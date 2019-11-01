package juc.yang01;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
* Sale Ticket
* ������ƱԱ  ���� 30��Ʊ
*
* ��**���ھ۵����**��ǰ���£�**�߳�  ����  ��Դ��**
* 1��һ�Բ��ϣ��ȴ���һ����Դ�࣬30��Ʊ
* 2������  ��Դ��
* */
public class Ticket {//��Դ�� = ʵ������ + ʵ������
    private int number = 30;

    public void sale(){
        // �ӿ�---ʵ���ࣻReentrantLock�ǿ����뻥����
        Lock l = new ReentrantLock();
        l.lock();
        try { // access the resource protected by this lock
            if(number>0){
                System.out.println(Thread.currentThread().getName()+"\t������"+(number--)+"��Ʊ����ʣ��"+number+"��Ʊ");
            }
        } catch(Exception e) {
            e.printStackTrace();
        } finally
        {
            l.unlock();
        }
    }
}
