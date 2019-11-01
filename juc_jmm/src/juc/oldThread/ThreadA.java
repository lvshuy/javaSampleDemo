package juc.oldThread;

public class ThreadA extends Thread{
    @Override
    public void run() {
        super.run();
        try{
//            要执行的操作
            Thread.sleep(500L);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("This is ThreadA");
    }
}