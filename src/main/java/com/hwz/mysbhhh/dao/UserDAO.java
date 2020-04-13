package com.hwz.mysbhhh.dao;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hwz.mysbhhh.mapper.UserMapper;
import com.hwz.mysbhhh.model.UserDO;
import org.springframework.stereotype.Repository;

/**
 * @author hwz
 * @date 2020/4/13
 */
@Repository
public class UserDAO extends ServiceImpl<UserMapper, UserDO> {
}
