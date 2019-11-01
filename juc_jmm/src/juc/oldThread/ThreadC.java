package juc.oldThread;

import java.util.concurrent.Callable;

public class ThreadC implements Callable<String> {
    @Override
    public String call() throws Exception {
        try{
            Thread.sleep(500L);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("This is ThreadC");
        return "Result";
    }
}
