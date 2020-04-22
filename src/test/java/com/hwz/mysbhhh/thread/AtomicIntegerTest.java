package com.hwz.mysbhhh.thread;

import sun.misc.Unsafe;

import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author hwz
 * @date 2020/4/8
 */
public class AtomicIntegerTest {
    private static final int THREAD_COUNT = 2;
    private static int count =0;
    private static volatile int countVolatile =0;
    private static AtomicInteger atomicInteger =new AtomicInteger(0);
    private static CountDownLatch countDownLatch = new CountDownLatch(2);

    public static void increase(){
        count++;
        countVolatile++;
        atomicInteger.incrementAndGet();
    }
    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[THREAD_COUNT];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(()->{
                for (int j = 0; j < 1000; j++) {
                    increase();
                }
                countDownLatch.countDown();
            });
            threads[i].start();
        }
        countDownLatch.await();
        System.out.println(count);
        System.out.println(countVolatile);
        System.out.println(atomicInteger.get());
    }
}
