package com.hwz.mysbhhh.collect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author hwz
 * @date 2020/4/10
 */
public class CollectTest {
    public static void main(String[] args) {
        List<String> s1 = new ArrayList<>();
        List<String> s2 = new ArrayList<>();
//        s2.add("s");
//        s1.add("s");
        boolean flag1 = s1==null||s1.isEmpty();
        boolean flag2 = s2==null||s2.isEmpty();
        if (flag1&&flag2){
                System.out.println("xxx");
        }
            System.out.println("hhh");
    }
}
