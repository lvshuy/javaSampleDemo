package juc.oldThread;

public class ThreadB implements Runnable {
    @Override
    public void run() {
        try{
            //            要执行的操作
            Thread.sleep(500);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("This is ThreadB");
    }
}
