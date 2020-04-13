package com.hwz.mysbhhh.controller;

import com.hwz.mysbhhh.model.UserDO;
import com.hwz.mysbhhh.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author hwz
 * @date 2020/4/13
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("getByid")
    public UserDO getByid(Long id) {
        return userService.getById(id);
    }

    @PutMapping("updateById")
    public Boolean updateById(@RequestBody UserDO userDO) {
        return userService.updateById(userDO);
    }
}
