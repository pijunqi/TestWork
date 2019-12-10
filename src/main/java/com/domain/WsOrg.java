package com.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class WsOrg {
    private String id;

    /**
    * 1;科室医生,2,医生名称
    */
    private String name;

    /**
    * 类型:1-科室;2-医生
    */
    private Short type;

    private String pid;
}