package com.pojo;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@TableName("sys_perm")
@Data
public class SysPerm implements Serializable {
    private String pval;    // 权限值，shiro的权限控制表达式
    private String parent;  // 父节点权限值
    private String pname;   // 权限名称
    private Integer ptype;  // 权限类型：1.菜单；2.按钮
    private Boolean leaf;   // 是否叶子节点
    private Date created;   // 创建时间
    private Date updated;   // 修改时间
}
