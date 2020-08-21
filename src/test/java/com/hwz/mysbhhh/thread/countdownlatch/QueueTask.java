package com.hwz.mysbhhh.thread.countdownlatch;

import java.util.concurrent.CountDownLatch;

/**
 * @author hwz
 * @date 2020/8/21
 */
public class QueueTask implements Runnable {
    private CountDownLatch countDownLatch;

    public QueueTask(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try {
            System.out.println("开始排队买药");
            Thread.sleep(5000);
            System.out.println("排队成功，缴费买药");

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (countDownLatch!=null){
                countDownLatch.countDown();
            }
        }
    }
}
