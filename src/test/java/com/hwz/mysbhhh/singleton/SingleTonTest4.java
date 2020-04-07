package com.hwz.mysbhhh.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 静态内部类
 *
 * @author hwz
 * @date 2020/4/2
 */
public class SingleTonTest4 implements Serializable {

    private SingleTonTest4() {
    }

    public static class SingleTonBuilder{
        private static final SingleTonTest4 singleTonTest4 = new SingleTonTest4();
    }
    public static SingleTonTest4 getInstance(){
        return SingleTonBuilder.singleTonTest4;
    }

}
