package com.hwz.mysbhhh.singleton;

/**
 * 懒汉
 *
 * @author hwz
 * @date 2020/4/2
 */
public class SingleTonTest2 {
    private static SingleTonTest2 singleTonTest;

    private SingleTonTest2() {
    }

    public static SingleTonTest2 getInstance() {
        if (singleTonTest == null) {
            singleTonTest = new SingleTonTest2();
        }
        return singleTonTest;
    }
}
