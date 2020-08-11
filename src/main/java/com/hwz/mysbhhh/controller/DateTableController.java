package com.hwz.mysbhhh.controller;

import com.hwz.mysbhhh.model.DateTableDO;
import com.hwz.mysbhhh.service.DateTableService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author hwz
 * @date 2020/7/29
 */
@RestController
@RequestMapping("/date/")
public class DateTableController {
    @Resource
    private DateTableService dateTableService;

    @PostMapping("addDate")
    public Boolean addDate(@RequestBody DateTableDO dateTableDO) {
        return dateTableService.addDate(dateTableDO);
    }

    @GetMapping("findAll")
    public List<DateTableDO> findAll() {
        return dateTableService.findAll();
    }
}
