package juc.lock8;

import static java.lang.Thread.*;

/*
* synchronized关键字
* 能够保证在同一时刻最多只有一个线程执行该段代码，以达到保证多线程并发安全的效果
*
1. 两个线程同时访问**同一对象**的不同同步方法  -->  对象锁；
====sedEmail====
====sedSMS====
2. 两个线程同时访问**两个对象**的同步方法  -->   分别两个对象锁，this；
====sedSMS====
====sedEmail====
3. 两个线程有序访问同一个对象的普通同步方法 --> 同步方法串行，因为使用的this是同一个对象；
====sedEmail====
====sedSMS====
4. 两个线程同时访问同一个对象的普通同步方法 --> 对象锁，哪个线程先拿到锁，哪个先执行；
====返回不确定====
5. 两个线程访问的是synchronized的**静态**方法  --> 类锁，Class；
====sedEmail====
====sedSMS====
6. 两个线程同时访问**同步方法**与**非同步方法** --> 不管同步方法是否为静态的，非同步方法都不受影响；
====hello====
====sedEmail====
7. 两个线程同时访问**静态**synchronized方法和**非静态**synchronized方法  -->  两个不同的锁，互不影响；
====sedSMS====
====sedEmail====
8. 方法抛出**异常**后，会**释放锁**  -->
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
