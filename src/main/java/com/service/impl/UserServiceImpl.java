package com.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.dao.UserMapper;
import com.pojo.SysUser;
import com.service.UserService;

public class UserServiceImpl extends ServiceImpl<UserMapper, SysUser> implements UserService {
    @Override
    public SysUser getUserByUname(String uname) {
        return super.baseMapper.getUserByUname(uname);
    }
}
