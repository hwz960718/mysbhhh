package com.hwz.mysbhhh.jvm;

/**
 * @author hwz
 * @date 2020/4/23
 */
public class Test {
    public static Test  t1=new Test();
    {
        System.out.println("执行1");
    }
    static
    {
        System.out.println("执行2");
    }
    public static void main(String[] args) {
        Test t2=new Test();
    }
}
