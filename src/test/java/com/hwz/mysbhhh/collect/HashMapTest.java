package com.hwz.mysbhhh.collect;

/**
 * @author hwz
 * @date 2020/6/8
 */
public class HashMapTest {
    public static void main(String[] args) {
//        System.out.println(1<<4);
//        System.out.println(20>>2);
//        System.out.println(20 >>> 2);
//        System.out.println(-20 >>> 2);
//        System.out.println(119719 >>> 16);
        String key = "hwz";
        //先取hash值
        int hash = key.hashCode();
        //再把hash值向右位移16位
        int i = hash >>> 16;
        System.out.println(hash);
        System.out.println(i);
        //最后进行异或运算
        System.out.println(hash^i);
    }
}
