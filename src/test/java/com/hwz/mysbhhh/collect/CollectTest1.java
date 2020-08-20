package com.hwz.mysbhhh.collect;

import com.hwz.mysbhhh.redis.User;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author hwz
 * @date 2020/4/22
 */
public class CollectTest1 {
    public static void main(String[] args) {
        String str = "12,554,56,889";
//        StringBuilder stringBuilder = new StringBuilder();
//        StringBuilder append = stringBuilder.append(str);
//        System.out.println(append.reverse());
//        String[] split = append.toString().split(",");
//        List<String> strings = Arrays.asList(split);
//        List<Integer> collect = strings.stream().map(Integer::valueOf).collect(Collectors.toList());
//        collect.forEach(System.out::println);
        List<String> strings = Arrays.asList(str.split(","));
//        List<Integer> collect = strings.stream().map(Integer::valueOf).collect(Collectors.toList());
//        Collections.reverse(collect);
//        collect.forEach(System.out::println);
        List<User> list = new ArrayList<>();
        list.add(new User("hhh", 1));
        list.add(new User("www", 2));
        list.add(new User("zzz", 3));
        List<User> collect1 = list.stream().sorted(Comparator.comparing(User::getType).reversed()).collect(Collectors.toList());
        collect1.forEach(System.out::println);
    }
}
