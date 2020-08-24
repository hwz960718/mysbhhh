package com.hwz.mysbhhh.thread.countdownlatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * CountDownLatch模拟并发示例
 * @author hwz
 * @date 2020/4/7
 */
public class CountDownLatchTest2 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        CountDownLatch countDownLatch = new CountDownLatch(50);
        for (int i = 0; i <50 ; i++) {
            CountRunnable countRunnable = new CountRunnable(countDownLatch);
            executorService.execute(countRunnable);
        }
    }
    static class CountRunnable implements Runnable{
        private CountDownLatch countDownLatch;
        public CountRunnable(CountDownLatch countDownLatch) {
            this.countDownLatch = countDownLatch;
        }
        @Override
        public void run() {
            synchronized (countDownLatch){
                //每次减少一个
                countDownLatch.countDown();
                System.out.println("count:"+countDownLatch.getCount());
            }
            try {
                countDownLatch.await();
                System.out.println("concurrency counts = " + (50 - countDownLatch.getCount()));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
