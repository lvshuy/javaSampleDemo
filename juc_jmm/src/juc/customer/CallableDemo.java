package juc.customer;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableDemo implements Callable<Integer>{
    @Override
    public Integer call() throws Exception{
        return 1024;
    }
}

class Test04 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        FutureTask<Integer> futuerTask = new FutureTask(new CallableDemo());

        new Thread(futuerTask,"A").start();

        Integer result = futuerTask.get();
        System.out.println(result);
    }
}