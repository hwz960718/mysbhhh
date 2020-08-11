package com.hwz.mysbhhh.service;

import com.hwz.mysbhhh.model.DateTableDO;

import java.util.List;

/**
 * @author hwz
 * @date 2020/7/29
 */
public interface DateTableService {

    Boolean addDate(DateTableDO dateTableDO);

    List<DateTableDO> findAll();
}
