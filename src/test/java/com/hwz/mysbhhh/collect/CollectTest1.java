package com.hwz.mysbhhh.collect;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author hwz
 * @date 2020/4/22
 */
public class CollectTest1 {
    public static void main(String[] args) {
        String str = "12,56,554,889";
//        StringBuilder stringBuilder = new StringBuilder();
//        StringBuilder append = stringBuilder.append(str);
//        System.out.println(append.reverse());
//        String[] split = append.toString().split(",");
//        List<String> strings = Arrays.asList(split);
//        List<Integer> collect = strings.stream().map(Integer::valueOf).collect(Collectors.toList());
//        collect.forEach(System.out::println);
        List<String> strings = Arrays.asList(str.split(","));
        List<Integer> collect = strings.stream().map(Integer::valueOf).collect(Collectors.toList());
        Collections.reverse(collect);
        collect.forEach(System.out::println);
    }
}
