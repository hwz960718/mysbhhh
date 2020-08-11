package com.hwz.mysbhhh.jvm;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author hwz
 * @date 2020/8/7
 * 栈溢出测试
 */
public class StackOverFlowTest {
    static AtomicInteger count = new AtomicInteger(0);
    private static void redo(){
        count.incrementAndGet();
        redo();
    }

    public static void main(String[] args) {
        try {
            redo();
        } catch (Exception e) {
            System.out.println(count);
        }
    }
}
