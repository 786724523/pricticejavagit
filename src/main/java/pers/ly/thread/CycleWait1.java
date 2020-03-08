package pers.ly.thread;

import java.util.Date;

public class CycleWait1 implements Runnable {
    private String name;

    public CycleWait1(String name) {
        this.name = name;
    }

    private String value;

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " : " + new Date());
        value = "we have data now";
        System.out.println(Thread.currentThread().getName() + " : " + new Date());
    }
}
