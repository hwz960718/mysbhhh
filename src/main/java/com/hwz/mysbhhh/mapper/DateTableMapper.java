package com.hwz.mysbhhh.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hwz.mysbhhh.model.DateTableDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author hwz
 * @date 2020/7/29
 */
@Mapper
public interface DateTableMapper extends BaseMapper<DateTableDO> {
    @Select("select * from t_date_table where #{date} <= DATE_FORMAT( admission_end, '%H:%i:%S' ) " +
            "and #{date} >= DATE_FORMAT( admission_start, '%H:%i:%S' )")
    List<DateTableDO> findAll(@Param("date") String date);
}
