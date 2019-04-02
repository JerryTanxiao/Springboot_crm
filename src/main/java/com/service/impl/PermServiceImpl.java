package com.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dao.PermMapper;
import com.pojo.SysPerm;
import com.service.PermService;
import com.vo.PublicVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermServiceImpl extends ServiceImpl<PermMapper,SysPerm> implements PermService {

    @Autowired
    private PermMapper permMapper;

    @Override
    public Boolean addPerm(SysPerm sysPerm) {
        return baseMapper.insert(sysPerm) > 0;
    }

    @Override
    public void deletePerm(String pval) {
        baseMapper.delete(new QueryWrapper<SysPerm>().eq("pval",pval));
    }

    @Override
    public void updatePerm(SysPerm sysPerm) {
        permMapper.updatePerm(sysPerm);
    }

    @Override
    public List<PublicVo> findPermsByLikePname(String pname) {
        return permMapper.findPermsByLikePname(pname);
    }

    @Override
    public List<PublicVo> findPermsByLikePval(String pval) {
        return permMapper.findPermsByLikePval(pval);
    }

    @Override
    public List<PublicVo> getPermsByUid(String user_id) {
        return permMapper.getPermsByUid(user_id);
    }

    @Override
    public List<PublicVo> getPermsByRid(String role_id) {
        return permMapper.getPermsByRid(role_id);
    }

    @Override
    public void updatePermByRid(String role_id) {

    }

    @Override
    public void deletePermByRid(String role_id) {

    }

    @Override
    public void addPermByRid(String role_id) {

    }


}
