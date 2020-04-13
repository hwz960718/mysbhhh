package com.hwz.mysbhhh.model;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.*;

import java.io.Serializable;

/**
 * @author hwz
 * @date 2020/4/13
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@TableName("t_user")
public class UserDO implements Serializable {
    /**
     * 主键
     */
    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;

    /**
     * name
     */
    private String name;
    /**
     * age
     */
    @TableField(updateStrategy = FieldStrategy.IGNORED)
    private Integer age;
}
