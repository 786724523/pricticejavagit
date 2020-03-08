package pers.ly.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class FutureTaskDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<String> task=new FutureTask<String>(new MyCallable());
        Thread thread = new Thread(task);
        Thread.sleep(1000);
        thread.start();

        if(!task.isDone()){
            System.out.println("task has not finish, please wait!");
        }
        System.out.println("task reutrn : "+ task.get());//get会等待Callable有返回值之后才会返回
    }
}
