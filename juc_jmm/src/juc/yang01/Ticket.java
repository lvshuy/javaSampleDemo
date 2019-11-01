package juc.yang01;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
* Sale Ticket
* 三个售票员  卖出 30张票
*
* 在**高内聚低耦合**的前提下，**线程  操作  资源类**
* 1）一言不合，先创建一个资源类，30张票
* 2）操作  资源类
* */
public class Ticket {//资源类 = 实例变量 + 实例方法
    private int number = 30;

    public void sale(){
        // 接口---实现类；ReentrantLock是可重入互斥锁
        Lock l = new ReentrantLock();
        l.lock();
        try { // access the resource protected by this lock
            if(number>0){
                System.out.println(Thread.currentThread().getName()+"\t卖出第"+(number--)+"张票，还剩下"+number+"张票");
            }
        } catch(Exception e) {
            e.printStackTrace();
        } finally
        {
            l.unlock();
        }
    }
}
