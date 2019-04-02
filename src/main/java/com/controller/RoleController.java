package com.controller;


import com.annotation.PermAnnotation;
import com.model.ResultModel;
import com.pojo.SysRole;
import com.service.RoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author FrankD123
 * @since 2019-04-01
 */
@RestController
@PermAnnotation(pname = "系统角色模块")
@RequestMapping("/role")
public class RoleController {

    private static final Logger log = LoggerFactory.getLogger(RoleController.class);

    @Autowired
    private RoleService roleService;

    @PostMapping("/add")
    public ResultModel addRole(@RequestParam("rname") String rname, @RequestParam("rval") String rval, @RequestParam("rdesc")String  rdesc){
        String oper = "添加角色";
        System.out.println(rname+"-----------------");
        SysRole sysRole = new SysRole();
        SysRole roleByRname = roleService.findRoleByRname(rname);
        if (roleByRname != null){
            return ResultModel.fail(oper,"该角色已经存在:" + rname);
        }
        sysRole.setRid(""+System.currentTimeMillis());//rid以时间戳来表示
        sysRole.setRname(rname);
        sysRole.setRval(rval);
        sysRole.setRdesc(rdesc);
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        sysRole.setCreated(timestamp);
        sysRole.setUpdated(timestamp);
        roleService.addRole(sysRole);
        return ResultModel.succ(oper,"角色添加成功").data("role",sysRole);
    }

    @DeleteMapping("/delete")
    public ResultModel deleteRole(@RequestParam("rid") String rid){
        String oper = "删除角色";
        SysRole roleByRid = roleService.findRoleByRid(rid);
        if(roleByRid == null) {
            return ResultModel.fail(oper,"角色为空，删除失败");
        }
        roleService.deleteRoleByRid(rid);
        return ResultModel.succ(oper,"删除成功角色");
    }

    @PatchMapping("/update")
    public ResultModel updateRole(@RequestParam("rname") String rname, @RequestParam("rdesc")String  rdesc,@RequestParam("rval") String rval){
        String oper = "更新角色";
        SysRole roleByRval = roleService.findRoleByRval(rval);
        if(roleByRval == null) {
            return ResultModel.fail(oper,"角色为空，更新失败");
        }
        roleByRval.setRname(rname);
        roleByRval.setRdesc(rdesc);
        roleService.updateRoleByRid(roleByRval);
        return ResultModel.succ(oper,"角色更新成功").data("role",roleByRval);
    }

    @PostMapping("/findByRname")
    public ResultModel findByRname(@RequestParam("rname") String rname){
        String oper = "根据角色名查找角色";
        SysRole roleByRname = roleService.findRoleByRname(rname);
        if(roleByRname == null) {
            return ResultModel.fail(oper,"角色为空，查询失败");
        }
        return ResultModel.succ(oper,"角色查找成功").data("role",roleByRname);
    }

    @PostMapping("/findByRval")
    public ResultModel findByRval(@RequestParam("rval") String rval){
        String oper = "根据角色值查找角色";
        SysRole roleByRval = roleService.findRoleByRval(rval);
        if(roleByRval == null) {
            return ResultModel.fail(oper,"角色为空，查询失败");
        }
        return ResultModel.succ(oper,"角色查找成功").data("role",roleByRval);
    }
}


