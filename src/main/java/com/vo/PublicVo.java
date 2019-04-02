package com.vo;

import lombok.Data;

import java.io.Serializable;
@Data
public class PublicVo implements Serializable {
    private String name;//名字
    private String val;//值
    private String other = "";//其他属性，用于扩展
}
