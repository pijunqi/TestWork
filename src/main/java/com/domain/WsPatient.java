package com.domain;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class WsPatient {
    private String id;

    /**
    * 身份证号
    */
    private String patientNo;

    /**
    * 姓名病人
    */
    private String namePatient;

    /**
    * 性别
    */
    private String sex;

    /**
    * 最近一次操作时间
    */
    private LocalDateTime createdate;

    /**
    * 生日
    */
    private String brithday;
}