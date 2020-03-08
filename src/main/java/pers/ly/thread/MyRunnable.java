package pers.ly.thread;

public class MyRunnable implements Runnable {
    private String name;
    public MyRunnable(String name){
        this.name=name;
    }
    @Override
    public void run() {
        try{
            System.out.println("开始");
            Thread.currentThread().sleep(30000);
            System.out.println("结束");
        }catch (Exception e){
            System.out.println("线程被强制结束");
        }

    }
}
