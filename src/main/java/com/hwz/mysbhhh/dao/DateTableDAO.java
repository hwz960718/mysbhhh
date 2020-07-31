package com.hwz.mysbhhh.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hwz.mysbhhh.mapper.DateTableMapper;
import com.hwz.mysbhhh.model.DateTableDO;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author hwz
 * @date 2020/7/29
 */
@Repository
public class DateTableDAO extends ServiceImpl<DateTableMapper, DateTableDO> {
    @Resource
    private DateTableMapper dateTableMapper;

    public List<DateTableDO> findAll() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String format = sdf.format(new Date());
        return dateTableMapper.findAll(format);
    }
}
