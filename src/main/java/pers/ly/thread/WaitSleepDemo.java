package pers.ly.thread;

public class WaitSleepDemo {
    public static void main(String[] args) {
        final Object lock = new Object();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread A is waiting to get lock.");
                synchronized (lock) {
                    try {
                        System.out.println("Thread A get lock");
                        Thread.sleep(20);
                        System.out.println("Thread A do wait method");
                        lock.wait();
                        System.out.println("Thread A is done");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread B is waiting to get lock.");
                synchronized (lock) {
                    try {
                        System.out.println("Thread B get lock");
                        System.out.println("Thread B is sleeping 10 ms");
                        Thread.sleep(10);
                        System.out.println("Thread B is done");
                        lock.notifyAll();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
