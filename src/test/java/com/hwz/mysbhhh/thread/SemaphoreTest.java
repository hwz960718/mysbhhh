package com.hwz.mysbhhh.thread;


import java.util.concurrent.Semaphore;

/**
 * @author hwz
 * @date 2020/8/19
 */
public class SemaphoreTest {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);
        for (int i = 0; i < 5; i++) {
            new Thread(new Task(semaphore,"hhh"+i)).start();
        }
    }

    static class Task extends Thread{
        Semaphore semaphore;
        public Task(Semaphore semaphore,String threadName){
            this.semaphore = semaphore;
            this.setName(threadName);
        }

        public void run(){
            try {
                semaphore.acquire();
                System.out.println(Thread.currentThread().getName()+"acquire at time" + System.currentTimeMillis());
                Thread.sleep(1000);
                semaphore.release();
                System.out.println(Thread.currentThread().getName()+"acquire at time" + System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
