package com.hwz.mysbhhh.clone;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author hwz
 * @date 2020/1/8
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Cloneable {
    private String name;
    private Integer age;
    private Teacher teacher;

    public Student clone(){
        Student student = null;
        try {
            student = (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return student;
    }
}
