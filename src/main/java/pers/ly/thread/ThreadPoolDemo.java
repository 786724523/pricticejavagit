package pers.ly.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolDemo {
    public static void main(String[] args) throws Exception{
        ExecutorService executorService= Executors.newCachedThreadPool();
        Future<String> submit = executorService.submit(new MyCallable());
        if(!submit.isDone()){
            System.out.println("task has not finish, please wait!");
        }
        System.out.println(submit.get());
        executorService.shutdown();
    }
}
