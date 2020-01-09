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
public class Teacher implements Cloneable {
    private String name;
    private String course;
}
