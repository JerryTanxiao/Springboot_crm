package com.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dao.RoleMapper;
import com.pojo.SysRole;
import com.service.RoleService;
import com.vo.PublicVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author FrankD123
 * @since 2019-04-01
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, SysRole> implements RoleService {
    @Autowired
    private RoleMapper roleMapper;
    @Override
    public Boolean addRole(SysRole sysRole) {
        System.out.println("------------------");
        return baseMapper.insert(sysRole) > 0;
    }

    @Override
    public SysRole findRoleByRname(@Param("rname") String rname) {
        List<SysRole> roleList = baseMapper.selectList(new QueryWrapper<SysRole>().eq("rname", rname));
        if (roleList.size() > 0){
            return roleList.get(1);
        }
        return null;
    }

    @Override
    public SysRole findRoleByRval(String rval) {
        return baseMapper.selectOne(new QueryWrapper<SysRole>().eq("rval", rval));
    }

    @Override
    public SysRole findRoleByRid(String rid) {
        return baseMapper.selectById(rid);
    }

    @Override
    public Boolean updateRoleByRid(SysRole sysRole) {
        return baseMapper.updateById(sysRole) > 0;
    }

    @Override
    public Boolean deleteRoleByRid(String rid) {
        return baseMapper.deleteById(rid) > 0;
    }

    @Override
    public List<PublicVo> findRolesByUid(String uid) {
        return roleMapper.findRolesByUid(uid);
    }
}
