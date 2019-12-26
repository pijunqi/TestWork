package com.controller;

import com.domain.WsDoctor;
import com.service.WsDoctorService;
import com.utils.ExcelUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @program: TestWork
 * @description: poi导出
 * @author: pijunqi
 * @create: 2019-12-20 17:27
 **/
@RequestMapping("/poi")
@RestController
public class poiController {

    @Resource
    private WsDoctorService wsDoctorService;

    @RequestMapping("/export")
    public void export(HttpServletResponse response){

        //从数据库获取需要导出的数据
        System.out.println("66666666666");
        List<WsDoctor> WsDoctorList = wsDoctorService.selectAllDoctor();
        System.out.println(WsDoctorList);
//        List<WsDoctor> WsDoctorList = new ArrayList<>();
//        WsDoctor WsDoctor1 = new WsDoctor("小明","1",new Date());
//        WsDoctor WsDoctor2 = new WsDoctor("小李","1", new Date());  selectAllDoctor
//        WsDoctor WsDoctor3 = new WsDoctor("小花","2", new Date());
//        WsDoctor WsDoctor4 = new WsDoctor("小狸","2", new Date());
//        WsDoctorList.add(WsDoctor1);
//        WsDoctorList.add(WsDoctor2);
//        WsDoctorList.add(WsDoctor3);
//        WsDoctorList.add(WsDoctor4);

        //导出操作
        ExcelUtil.exportExcel(WsDoctorList,null,"医生简介",WsDoctor.class,"医生简介.xls",response);
    }

    @RequestMapping("/importExcel")
    public void importExcel(){
        String filePath = "F:\\年轻人.xls";
        //解析excel，
        List<WsDoctor> WsDoctorList = ExcelUtil.importExcel(filePath,1,1,WsDoctor.class);
        //也可以使用MultipartFile,使用 FileUtil.importExcel(MultipartFile file, Integer titleRows, Integer headerRows, Class<T> pojoClass)导入
        System.out.println("导入数据一共【"+WsDoctorList.size()+"】行");

    }

    @RequestMapping("/ceshi")
    public WsDoctor importExcel1(String id){
        WsDoctor wsDoctor = wsDoctorService.selectByPrimaryKey( id);


        return wsDoctor;
    }


}
