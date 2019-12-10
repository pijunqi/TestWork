package com.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class WsReportWatch {
    private String id;

    /**
    * 一级模板ID
    */
    private String wsTemplet1Id;

    /**
    * 模板值
    */
    private String value;

    private String wsReportId;

    /**
    * 模板名称
    */
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