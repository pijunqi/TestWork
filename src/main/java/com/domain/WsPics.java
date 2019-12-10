package com.domain;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class WsPics {
    private String id;

    /**
    * 患者id
    */
    private String patientId;

    /**
    * 患者唯一识别号
    */
    private String patientNo;

    /**
    * 图片路径
    */
    private String path;

    private String wsReportId;

    private String picname;

    /**
    * 0-图片,1-录像
    */
    private Short type;

    private LocalDateTime createtime;

    /**
    * 0-未选;1-已选
    */
    private Short selected;

    /**
    * 选择顺序号
    */
    private Short seq;
}