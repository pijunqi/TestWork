package com.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class WsRoom {
    private String id;

    /**
    * 房间名称
    */
    private String name;

    /**
    * 类型: 1-胃镜;2-肠镜;3-胃肠镜
    */
    private Short type;
}