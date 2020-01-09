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
public class Student1 implements Cloneable {
    private String name;
    private Integer age;
    private Teacher1 teacher1;

    public Student1 clone(){
        Student1 student = null;
        try {
            student = (Student1) super.clone();
            Teacher1 clone = this.teacher1.clone();
            student.setTeacher1(clone);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return student;
    }
}
