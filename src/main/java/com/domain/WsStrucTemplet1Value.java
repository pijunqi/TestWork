package com.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class WsStrucTemplet1Value {
    private String id;

    /**
    * 模板ID
    */
    private String wsTemplet1Id;

    /**
    * 模板值
    */
    private String value;
}