package com.test.word.poi;

import com.domain.WsDoctor;
import com.service.WsDoctorService;
import com.utils.ExcelUtil;
import org.junit.Test;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: TestWork
 * @description: poi
 * @author: pijunqi
 * @create: 2019-12-20 16:47 WsDoctor
 **/

@RestController
public class poiTest {

//    @Resource
//    private WsDoctorService wsDoctorService;
//    List<WsDoctor> WsDoctorList = wsDoctorService.selectAllDoctor();
//
//    public void export(HttpServletResponse response) {
//        //导出操作
//        ExcelUtil.exportExcel(WsDoctorList, null, "医生简介", WsDoctor.class, "医生简介.xls", response);
//
//
//    }

    @Test
    public void export1() {
        System.out.println("666666666");
    }
}
