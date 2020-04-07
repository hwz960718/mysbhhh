package com.hwz.mysbhhh.clone;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author hwz
 * @date 2020/1/8
 */
public class CloneTest {
    @Test
    public void cloneTest() {
        Teacher teacher = new Teacher("li", "数学");
        Student student = new Student("hhh", 20, teacher);

        Student clone = student.clone();
        clone.setName("lll");
        clone.setAge(22);
        clone.getTeacher().setName("yang");
        System.out.println(student.getName() + ":" + student.getAge());
        System.out.println(clone.getName() + ":" + clone.getAge());
        System.out.println(student.getTeacher());
        System.out.println(clone.getTeacher());
    }

    @Test
    public void cloneTest1() {
        Teacher1 teacher = new Teacher1("li", "数学");
        Student1 student = new Student1("hhh", 20, teacher);

        Student1 clone = student.clone();
        clone.setName("lll");
        clone.setAge(22);
        clone.getTeacher1().setName("yang");
        System.out.println(student.getName() + ":" + student.getAge());
        System.out.println(clone.getName() + ":" + clone.getAge());
        System.out.println(student.getTeacher1());
        System.out.println(clone.getTeacher1());
    }

    @Test
    public void solutionTest() {
        int[] nums = {2, 7, 9, 11};
        int target = 11;
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target-nums[i])){
                result[0] = map.get(target-nums[i]);
                result[1] = i;
            }
            map.put(nums[i],i);
        }
        System.out.println(Arrays.toString(result));
    }
    @Test
    public void ThreadTest() {
        ExecutorService executorService = Executors.newCachedThreadPool();
    }

}
