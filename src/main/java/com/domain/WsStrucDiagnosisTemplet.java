package com.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class WsStrucDiagnosisTemplet {
    private String id;

    /**
    * 模板ID
    */
    private String wsTempletId;

    /**
    * 一级模板ID
    */
    private String wsTemplet1Id;

    /**
    * 医生ID
    */
    private String wsDoctorId;

    /**
    * 模板值
    */
    private String value;
}