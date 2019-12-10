package com.domain;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class WsSysUser {
    private String id;

    /**
    * 用户名
    */
    private String nameUser;

    /**
    * 密码
    */
    private String password;

    /**
    * 医生id
    */
    private String doctorId;

    /**
    * 用户类型
    */
    private Short type;

    /**
    * 状态0-禁用;1-启用
    */
    private Short zt;

    /**
    * 有效时间起
    */
    private LocalDateTime timeStart;

    /**
    * 有效时间止
    */
    private LocalDateTime timeEnd;

    /**
    * 用户创建日期
    */
    private LocalDateTime createdate;
}