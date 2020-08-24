package com.hwz.mysbhhh.thread.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;

/**
 * @author hwz
 * @date 2020/8/24
 * CyclicBarrier demo
 */
public class CyclicBarrierTest implements Runnable {

    private CyclicBarrier cyclicBarrier;
    private Integer index;

    public CyclicBarrierTest(CyclicBarrier cyclicBarrier, Integer index) {
        this.cyclicBarrier = cyclicBarrier;
        this.index = index;
    }

    @Override
    public void run() {
        try {
            System.out.println("index:" + index);
            index--;
            cyclicBarrier.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(11, () -> System.out.println("到达屏障"));
        for (int i = 0; i < 10; i++) {
            new Thread(new CyclicBarrierTest(cyclicBarrier, i)).start();
        }
        cyclicBarrier.await();
        System.out.println("全部到达屏障");
    }
}
