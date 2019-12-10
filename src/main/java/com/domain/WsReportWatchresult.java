package com.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class WsReportWatchresult {
    private String id;

    /**
    * 模板id
    */
    private String wsTempletId;

    private String wsReportId;

    /**
    * 模板值
    */
    private String value;

    /**
    * 序号
    */
    private Short seq;
}