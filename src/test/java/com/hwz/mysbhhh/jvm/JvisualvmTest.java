package com.hwz.mysbhhh.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hwz
 * @date 2020/4/26
 * 测试内存溢出
 */
public class JvisualvmTest {
    Byte[] bytes = new Byte[100*1024];

    public static void main(String[] args) throws InterruptedException {
        List<JvisualvmTest> list = new ArrayList<>();
        while (true){
            list.add(new JvisualvmTest());
            Thread.sleep(50);
        }
    }
}
