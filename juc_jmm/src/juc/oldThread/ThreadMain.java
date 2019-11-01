package juc.oldThread;

import java.util.concurrent.FutureTask;

public class ThreadMain {
    public static void main(String[] args) throws Exception{
//        new ThreadA().start();

//        new Thread(new ThreadB()).start();
//        System.out.println("This is Main Function");

        FutureTask<String> futureTask = new FutureTask<String>(new ThreadC());
        new Thread(futureTask).start();

        System.out.println("This is Main Function: start");

        System.out.println("You can get the result :" +futureTask.get());

        System.out.println("This is Main Function: end");
    }
}
