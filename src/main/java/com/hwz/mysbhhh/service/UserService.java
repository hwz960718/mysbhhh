package com.hwz.mysbhhh.service;

import com.hwz.mysbhhh.model.UserDO;

import java.util.List;

/**
 * @author hwz
 * @date 2020/4/13
 */
public interface UserService {
    UserDO getById(Long id);
    Boolean updateById(UserDO userDO);
    List<UserDO> getUserByWrapper();
}
