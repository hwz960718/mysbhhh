package com.hwz.mysbhhh.service.impl;

import com.hwz.mysbhhh.service.TestService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author hwz
 * @date 2020/4/8
 */
@Service
@Transactional(isolation = Isolation.DEFAULT)
public class TestServiceImpl implements TestService {
}
