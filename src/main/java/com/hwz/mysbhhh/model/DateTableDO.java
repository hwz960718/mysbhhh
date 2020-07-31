package com.hwz.mysbhhh.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author hwz
 * @date 2020/7/29
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@TableName("t_date_table")
public class DateTableDO {
    private Long id;
    @JsonFormat(pattern = "HH:mm:ss")
    private Date admissionStart;
    @JsonFormat(pattern = "HH:mm:ss")
    private Date admissionEnd;
}
