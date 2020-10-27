package com.hwz.mysbhhh.thread;

import sun.misc.Unsafe;

import java.io.Serializable;

/**
 * @author hwz
 * @date 2020/5/16
 */
public class LqTest extends Number implements Serializable {
    private static final Unsafe unsafe = Unsafe.getUnsafe();
    public static void main(String[] args) {
        System.out.println(unsafe.getClass().getName());
    }
    private Integer value = 1;
    private String string = " ";


    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }
}
