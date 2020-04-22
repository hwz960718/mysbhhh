package com.hwz.mysbhhh.jvm;

/**
 * @author hwz
 * @date 2020/4/21
 */
public class Math {
    public static final Integer CONSTANT = 666;
    public int compute(){//一个方法对应一块栈帧内存区域
        //该变量
        int a = 1;
        int b = 2;
        int c = (a+b)*10;
        return c;
    }

    public static void main(String[] args) {
        //对象new出来时存放在堆内存
        Math math = new Math();
        //运行时创建出的局部变量 存放在jvm分配的栈内存中
        math.compute();
    }
}
