package juc.oldThread;

public class ThreadB implements Runnable {
    @Override
    public void run() {
        try{
            //            Ҫִ�еĲ���
            Thread.sleep(500);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("This is ThreadB");
    }
}
