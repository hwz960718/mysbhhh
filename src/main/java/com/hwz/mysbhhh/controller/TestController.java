package com.hwz.mysbhhh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author hwz
 * @date 2019/9/16
 */
@Controller
public class TestController {
    @ResponseBody
    @RequestMapping("/test")
    public String test(){
        return "success";
    }
}
