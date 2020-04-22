package com.hwz.mysbhhh.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hwz.mysbhhh.mapper.UserMapper;
import com.hwz.mysbhhh.model.UserDO;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author hwz
 * @date 2020/4/13
 */
@Repository
public class UserDAO extends ServiceImpl<UserMapper, UserDO> {

    @Resource
    private UserMapper userMapper;
    public List<UserDO> getUserByWrapper(){
        QueryWrapper<UserDO> queryWrapper = new QueryWrapper<>();
        queryWrapper.ne("name", "hwz");
        return userMapper.selectList(queryWrapper);
    }
}
