package com.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class WsDoctor {
    private String id;

    /**
    * 医生名称
    */
    private String nameDoctor;

    /**
    * 职位(0-科主任;1-医生;2-护士)
    */
    private Short type;

    /**
    * 科室
    */
    private String dept;

    /**
    * 签名
    */
    private String sign;
}