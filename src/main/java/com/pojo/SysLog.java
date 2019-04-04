package com.pojo;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("Sys_log")
public class SysLog {
    /*日志编号*/
    private Integer lid;
    /*用户id*/
    private String uid;
    /*用户名*/
    private String uname;
    /*操作日志的内容*/
    private String lcontent;
    /*操作日志类型*/
    private String ltype;
    /*日志创建时间*/
    private Date ldate;
    /*状态码*/
    private String lstatus;
    /*日志操作人*/
    private String nick;
}
