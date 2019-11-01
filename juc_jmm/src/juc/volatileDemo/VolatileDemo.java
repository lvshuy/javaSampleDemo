package juc.volatileDemo;

public class VolatileDemo {
    private static volatile boolean flag = false;

    public static void main(String[] args) throws InterruptedException {
        new Thread(()->{
            int i = 1;
            while (!flag) {
                System.out.println(i++);
            }
        }).start();
        System.out.println("Thread ====== start");
        Thread.sleep(1000);
        flag = true;
        System.out.println("Thread ====== end");
    }
}
