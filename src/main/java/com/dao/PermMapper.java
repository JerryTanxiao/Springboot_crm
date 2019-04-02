package com.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojo.SysPerm;
import com.vo.PublicVo;

import java.util.List;

public interface PermMapper extends BaseMapper<SysPerm> {
    void updatePerm(SysPerm sysPerm);

    List<PublicVo> findPermsByLikePname(String pname);

    List<PublicVo> findPermsByLikePval(String pval);

    List<PublicVo> getPermsByUid(String user_id);

    List<PublicVo> getPermsByRid(String role_id);

    void updatePermByRid(String role_id,SysPerm sysPerm);

    void deletePermByRid(String role_id);

    void addPermByRid(String role_id,SysPerm sysPerm);
}
