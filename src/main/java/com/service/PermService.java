package com.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pojo.SysPerm;
import com.vo.PublicVo;

import java.util.List;

public interface PermService extends IService<SysPerm> {

    /**
     * 添加权限
     * @param sysPerm
     * @return
     */
    Boolean addPerm(SysPerm sysPerm);

    void deletePerm(String pval);

    /**
     * 更新权限
     * @param sysPerm
     */
    void updatePerm(SysPerm sysPerm);

    /**
     * 根据权限名筛选权限
     * @param pname
     * @return
     */
    List<PublicVo> findPermsByLikePname(String pname);

    /**
     * 根据权限值筛选权限
     * @param pval
     * @return
     */
    List<PublicVo> findPermsByLikePval(String pval);

    /**
     * 根据用户id获取权限
     * @param user_id
     * @return
     */
    List<PublicVo> getPermsByUid(String user_id);

    /**
     * 根据角色id获取权限
     * @param role_id
     * @return
     */
    List<PublicVo> getPermsByRid(String role_id);

    void updatePermByRid(String role_id);

    void deletePermByRid(String role_id);

    void addPermByRid(String role_id);
}
