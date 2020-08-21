package com.hwz.mysbhhh.thread.countdownlatch;

import java.util.concurrent.CountDownLatch;

/**
 * @author hwz
 * @date 2020/8/21
 */
public class CountDownLatchRunner {
    public static void main(String[] args) throws InterruptedException {
        long now = System.currentTimeMillis();
        CountDownLatch countDownLatch = new CountDownLatch(2);
        new Thread(new DoctorQueue(countDownLatch)).start();
        new Thread(new QueueTask(countDownLatch)).start();
        //等待两个线程执行完
        countDownLatch.await();
        System.out.println(System.currentTimeMillis()-now);
    }
}
