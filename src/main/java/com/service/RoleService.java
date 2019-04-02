package com.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pojo.SysRole;
import com.vo.PublicVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author FrankD123
 * @since 2019-04-01
 */
public interface RoleService extends IService<SysRole> {
    /**
     * 添加role
     * @param sysRole
     * @return
     */
    Boolean addRole(SysRole sysRole);
    /**
     * 按角色名查找role
     * @param rname
     * @return
     */
    SysRole findRoleByRname(String rname);
    /**
     *  按角色值查找role
     * @param rval
     * @return
     */
    SysRole findRoleByRval(String rval);
    /**
     *  按角色id查找role
     * @param rid
     * @return
     */
    SysRole findRoleByRid(String rid);
    /**
     * 根据角色id更新role信息
     * @param sysRole
     * @return
     */
    Boolean updateRoleByRid(SysRole sysRole);
    /**
     * 根据角色id删除role
     * @param rid
     * @return
     */
    Boolean deleteRoleByRid(String rid);

    /**
     * 根据用户id获取到Roles的rname和rval，存储到PublicVo种
     * @param uid
     * @return
     */
    List<PublicVo> findRolesByUid(String uid);



}
