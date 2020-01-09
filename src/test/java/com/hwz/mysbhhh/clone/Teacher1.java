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
public class Teacher1 implements Cloneable {
    private String name;
    private String course;

    public Teacher1 clone(){
        Teacher1 teacher1 = null;
        try {
            teacher1 = (Teacher1) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return teacher1;
    }
}
