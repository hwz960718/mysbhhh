package com.hwz.mysbhhh.singleton;

/**
 * 饿汉
 *
 * @author hwz
 * @date 2020/4/2
 */
public class SingleTonTest1 {
    private SingleTonTest1() {
    }

    private static SingleTonTest1 singleTonTest = new SingleTonTest1();

    public static SingleTonTest1 getInstance() {
        return singleTonTest;
    }
}
