package com.hwz.mysbhhh.thread;

/**
 * @author hwz
 * @date 2020/4/30
 * 死锁demo
 */
public class DeadThread {
    private final static String resource_a = "A";
    private final static String resource_b = "B";
    private String hwz = "hwz";

    private static void deadLock() {
        Thread threadA = new Thread(() -> {
            synchronized (resource_a) {
                System.out.println("get a");
                try {
                    Thread.sleep(3000);
                    synchronized (resource_b) {
                        System.out.println("get b");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread threadB = new Thread(() -> {
            synchronized (resource_b) {
                System.out.println("get b");
                synchronized (resource_a) {
                    System.out.println("get a");
                }
            }
        });
        threadA.start();
        threadB.start();
    }

    public static void main(String[] args) {
        deadLock();
    }

}
