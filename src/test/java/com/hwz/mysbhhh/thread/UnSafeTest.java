package com.hwz.mysbhhh.thread;

import lombok.extern.slf4j.Slf4j;
import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * @author hwz
 * @date 2020/4/29
 */
@Slf4j
public class UnSafeTest {
    public static void main(String[] args) throws IllegalAccessException {
        //Unsafe是构造方法私有化的final修饰的对象，只能通过反射来获取
        Field field = Unsafe.class.getDeclaredFields()[0];
        field.setAccessible(true);
        Unsafe unsafe = (Unsafe) field.get(null);
        System.out.println(unsafe);
        Field field1 = DeadThread.class.getDeclaredFields()[0];
        field1.setAccessible(true);
        DeadThread o = (DeadThread) field.get(DeadThread.class);

        System.out.println(field1.getName());

    }
}
