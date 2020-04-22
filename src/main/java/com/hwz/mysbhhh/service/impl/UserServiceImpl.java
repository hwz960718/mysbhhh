package com.hwz.mysbhhh.service.impl;

import com.hwz.mysbhhh.dao.UserDAO;
import com.hwz.mysbhhh.model.UserDO;
import com.hwz.mysbhhh.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author hwz
 * @date 2020/4/13
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDAO userDAO;

    @Override
    public UserDO getById(Long id) {
        return userDAO.getById(id);
    }

    @Override
    public Boolean updateById(UserDO userDO) {

        return userDAO.updateById(userDO);
    }

    @Override
    public List<UserDO> getUserByWrapper() {
        return userDAO.getUserByWrapper();
    }
}
