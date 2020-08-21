package com.hwz.mysbhhh.thread.countdownlatch;

import java.util.concurrent.CountDownLatch;

/**
 * @author hwz
 * @date 2020/8/21
 */
public class DoctorQueue implements Runnable{
    private CountDownLatch countDownLatch;

    public DoctorQueue(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try {
            System.out.println("开始看医生");
            Thread.sleep(3000);
            System.out.println("看医生结束，准备离开病房");

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (countDownLatch!=null){
                countDownLatch.countDown();
            }
        }
    }
}

