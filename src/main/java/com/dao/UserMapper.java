package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.pojo.SysUser;

public interface UserMapper extends BaseMapper<SysUser> {
    SysUser getUserByUname(String uname);
}
