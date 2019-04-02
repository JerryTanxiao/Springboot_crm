package com.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojo.SysRole;
import com.vo.PublicVo;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author FrankD123
 * @since 2019-04-01
 */
public interface RoleMapper extends BaseMapper<SysRole> {
    List<PublicVo> findRolesByUid(String uid);
}
