package com.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class WsTempletHome {
    private String id;

    /**
    * 模板名称
    */
    private String nameTemplet;

    /**
    * 父节点id
    */
    private String pid;

    /**
    * 模板内容
    */
    private String content;

    private Short status;

    /**
    * 1,胃镜.2肠镜
    */
    private Short type;

    /**
    * 类别: 1-诊断;2-治疗
    */
    private Short category;

    /**
    * 顺序号
    */
    private Short seq;
}