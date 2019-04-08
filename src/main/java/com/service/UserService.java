package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.pojo.SysUser;

public interface UserService extends IService<SysUser> {
    SysUser getUserByUname(String uname);
}
