package com.domain;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class WsDoctor {
    @Excel(name="id", orderNum = "0")
    private String id;

    /**
    * 医生名称
    */
    @Excel(name="医生名称", orderNum = "1")
    private String nameDoctor;

    /**
    * 职位(0-科主任;1-医生;2-护士)
    */
    @Excel(name="职位", orderNum = "2")
    private Short type;

    /**
    * 科室
    */
    @Excel(name="科室", orderNum = "3")
    private String dept;

    /**
    * 签名
    */
    @Excel(name="签名", orderNum = "4")
    private String sign;
}