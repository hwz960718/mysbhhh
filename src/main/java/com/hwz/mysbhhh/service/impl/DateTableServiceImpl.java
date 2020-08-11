package com.hwz.mysbhhh.service.impl;

import com.hwz.mysbhhh.dao.DateTableDAO;
import com.hwz.mysbhhh.model.DateTableDO;
import com.hwz.mysbhhh.service.DateTableService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author hwz
 * @date 2020/7/29
 */
@Service
public class DateTableServiceImpl implements DateTableService {
    @Resource
    private DateTableDAO dateTableDAO;
    @Override
    @Transactional(rollbackFor = Exception.class)
    public Boolean addDate(DateTableDO dateTableDO) {
        return dateTableDAO.save(dateTableDO);
    }

    @Override
    public List<DateTableDO> findAll() {
        return dateTableDAO.findAll();
    }
}
