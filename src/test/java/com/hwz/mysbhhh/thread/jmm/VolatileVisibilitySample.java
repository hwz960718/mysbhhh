package com.hwz.mysbhhh.thread.jmm;

import java.util.ArrayList;

/**
 * @author hwz
 * @date 2020/10/20
 * volatile demo
 */
public class VolatileVisibilitySample {
    volatile boolean initFlag = false;
    public void save(){
        this.initFlag = true;
        String threadName = Thread.currentThread().getName();
        System.out.println("线程:"+threadName+"修改共享变量");
    }
    public void load(){
        String threadName = Thread.currentThread().getName();
        while (!initFlag){
            //这里空跑 等待共享变量改变状态
        }
        System.out.println("线程:"+threadName+"当前线程发现共享变量状态改变");

    }
    public static void main(String[] args) {
        VolatileVisibilitySample volatileVisibilitySample = new VolatileVisibilitySample();
        Thread threadA = new Thread(volatileVisibilitySample::save,"ThreadA");
        Thread threadB = new Thread(volatileVisibilitySample::load,"ThreadB");
        threadB.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadA.start();
    }
}
