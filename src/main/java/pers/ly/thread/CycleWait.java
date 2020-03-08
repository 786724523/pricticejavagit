package pers.ly.thread;

import java.util.Date;

public class CycleWait implements Runnable {
    private String name;
    public CycleWait(String name){
        this.name=name;
    }
    private String value;
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" : "+new Date());
        try {
            Thread.currentThread().sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        value = "we have data now";
        System.out.println(Thread.currentThread().getName()+" : "+new Date());
    }

    public static void main(String[] args) throws Exception {
        CycleWait c1 = new CycleWait("刘洋");
        CycleWait c2 = new CycleWait("陶雪");
        CycleWait1 c3 = new CycleWait1("关艳丽");
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        Thread t3 = new Thread(c3);
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        System.out.println("value1 : " + c1.value+"start");
        System.out.println("value2 : " + c1.value+"start");
        System.out.println("value3 : " + c1.value+"start");
    }
}
