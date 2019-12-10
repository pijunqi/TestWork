package com.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class WsReportErrorZtBak {
    private String id;

    /**
    * 检查日期
    */
    private LocalDateTime datecheck;

    /**
    * 姓名病人
    */
    private String namePatient;

    /**
    * 性别
    */
    private String sex;

    /**
    * 检查项目:
无痛胃镜
无痛胃镜-超声内镜
无痛肠镜
无痛肠镜-超声内镜
胶囊内镜
普通胃镜
普通肠镜
无痛胃肠镜
无痛胃肠镜-超声内镜
    */
    private String examItem;

    /**
    * 身份证号
    */
    private String patientNo;

    /**
    * 电话
    */
    private String phone;

    /**
    * 患者ID
    */
    private String patientId;

    /**
    * 检查医师姓名
    */
    private String doctorName;

    /**
    * 检查医师id
    */
    private String doctorId;

    /**
    * 收费额
    */
    private BigDecimal charge;

    /**
    * 状态：-2预约取消-1-报到.0-预约,1-完成,2-数据异常,3-作废,4-归档,5-检查中6活检7补费
    */
    private Short zt;

    /**
    * 镜下所见
    */
    private String watch;

    /**
    * 镜下诊断
    */
    private String watchresult;

    /**
    * 活检部位
    */
    private String specimen;

    /**
    * 病理诊断
    */
    private String specimenresult;

    /**
    * 建议
    */
    private String suggest;

    /**
    * 助手
    */
    private String assistant;

    /**
    * 仪器型号
    */
    private String device;

    /**
    * 创建日期
    */
    private LocalDateTime createdate;

    /**
    * 门诊号
    */
    private String clinicNo;

    /**
    * 住院号
    */
    private String inpNo;

    /**
    * 病床号
    */
    private String bedNo;

    /**
    * 病区
    */
    private String patientArea;

    /**
    * 检查号
    */
    private String patientLocalId;

    /**
    * 送检医师名称
    */
    private String doctorSendName;

    /**
    * 送检医师id
    */
    private String doctorSend;

    /**
    * 送检科室
    */
    private String dept;

    /**
    * 排号
    */
    private Integer seq;

    /**
    * 年龄
    */
    private Short age;

    /**
    * 来源
    */
    private String patientFrom;

    /**
    * 送检类别：普通，会诊，急诊
    */
    private String sendType;

    /**
    * 检查室
    */
    private String roomId;

    /**
    * 检查项目备注
    */
    private String examContent;

    /**
    * 传染4项
    */
    private String warningContagion4;

    /**
    * 用药史
    */
    private String warningMedical;

    /**
    * 过敏史
    */
    private String warningAllergy;

    /**
    * 打印次数
    */
    private Integer printcount;

    /**
    * 预约护士id
    */
    private String nurseId;

    /**
    * 实际检查时间
    */
    private LocalDateTime actualInspectionTime;

    /**
    * 尿素酶试验
    */
    private String urease;

    /**
    * 处理时间
    */
    private LocalDateTime chuliDate;
}