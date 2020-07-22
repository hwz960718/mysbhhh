package com.hwz.mysbhhh.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 多线程双重校验
 *
 * @author hwz
 * @date 2020/4/2
 */
public class SingleTonTest3 implements Serializable {
    private static volatile SingleTonTest3 singleTonTest;

    private SingleTonTest3() {
    }

    public static SingleTonTest3 getInstance() {
        //先判断线程是否已经创建线程实例对象
        if (singleTonTest == null){
            //让先进入的线程创建
            synchronized (SingleTonTest3.class){
                if (singleTonTest==null){
                    singleTonTest = new SingleTonTest3();
                }
            }
        }
        return singleTonTest;
//        ConcurrentHashMap
    }
    //防止反序列化产生新对象
    private Object readResolve() throws ObjectStreamException {
        return singleTonTest;
    }
}
