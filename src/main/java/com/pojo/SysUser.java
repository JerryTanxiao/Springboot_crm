package com.pojo;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Jerry123
 * @since 2019-04-01
 */
@TableName("sys_user")
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "uid", type = IdType.AUTO)
    private String uid;
    /**
     * 登录名
     */
    private String uname;
    /**
     * 用户昵称
     */
    private String nick;
    /**
     * 已加密的登录密码
     */
    private String pwd;
    /**
     * 加密盐值
     */
    private String salt;
    /**
     * 是否上锁
     */
    private Integer locked;
    /**
     * 创建时间
     */
    private Date created;
    /**
     * 修改时间
     */
    private Date updated;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 头像
     */
    @TableField("head_portrait")
    private String headPortrait;


    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid  = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Integer getLocked() {
        return locked;
    }

    public void setLocked(Integer locked) {
        this.locked = locked;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHeadPortrait() {
        return headPortrait;
    }

    public void setHeadPortrait(String headPortrait) {
        this.headPortrait = headPortrait;
    }

    @Override
    public String toString() {
        return "SysUser{" +
        ", uid=" + uid +
        ", uname=" + uname +
        ", nick=" + nick +
        ", pwd=" + pwd +
        ", salt=" + salt +
        ", locked=" + locked +
        ", created=" + created +
        ", updated=" + updated +
        ", email=" + email +
        ", headPortrait=" + headPortrait +
        "}";
    }
}
