package com.hwz.mysbhhh.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hwz.mysbhhh.model.UserDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author hwz
 * @date 2020/4/13
 */
@Mapper
public interface UserMapper extends BaseMapper<UserDO> {
}
