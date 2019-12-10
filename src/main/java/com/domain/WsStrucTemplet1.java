package com.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class WsStrucTemplet1 {
    private String id;

    private String name;

    /**
    * 类型: 1-胃部;2-肠部
    */
    private Short type;

    /**
    * 顺序号
    */
    private Short seq;
}