package com.hwz.mysbhhh.service;

import com.hwz.mysbhhh.model.UserDO;

/**
 * @author hwz
 * @date 2020/4/13
 */
public interface UserService {
    UserDO getById(Long id);
    Boolean updateById(UserDO userDO);
}
