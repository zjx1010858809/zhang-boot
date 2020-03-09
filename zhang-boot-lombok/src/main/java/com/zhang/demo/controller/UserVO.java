package com.zhang.demo.controller;

import lombok.Data;
import java.util.Date;

//添加@Data注解后不需要写getset方法（lombok的注解）
@Data
public class UserVO {
    private int id;
    private String username;
    private String password;
    private Byte sex;
    private Byte deleted;
    private Date updateTime;
    private Date createTime;
}
