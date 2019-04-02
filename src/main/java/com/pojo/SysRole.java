package com.pojo;

import com.baomidou.mybatisplus.annotations.TableName;

import java.util.Date;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author FrankD123
 * @since 2019-04-01
 */
@TableName("sys_role")
public class SysRole implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 角色id
     */
    private String rid;
    /**
     * 角色名
     */
    private String rname;
    /**
     * 角色描述
     */
    private String rdesc;
    /**
     * 角色值
     */
    private String rval;
    /**
     * 创建时间
     */
    private Date created;
    /**
     * 最后一次更改时间
     */
    private Date updated;


    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public String getRdesc() {
        return rdesc;
    }

    public void setRdesc(String rdesc) {
        this.rdesc = rdesc;
    }

    public String getRval() {
        return rval;
    }

    public void setRval(String rval) {
        this.rval = rval;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    @Override
    public String toString() {
        return "SysRole{" +
        ", rid=" + rid +
        ", rname=" + rname +
        ", rdesc=" + rdesc +
        ", rval=" + rval +
        ", created=" + created +
        ", updated=" + updated +
        "}";
    }
}
