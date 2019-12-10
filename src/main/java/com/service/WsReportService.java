package com.service;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import com.mapper.WsReportMapper;
import com.domain.WsReport;

@Service
public class WsReportService {

    @Resource
    private WsReportMapper wsReportMapper;


    public int deleteByPrimaryKey(String id) {
        return wsReportMapper.deleteByPrimaryKey(id);
    }


    public int insert(WsReport record) {
        return wsReportMapper.insert(record);
    }


    public int insertSelective(WsReport record) {
        return wsReportMapper.insertSelective(record);
    }


    public WsReport selectByPrimaryKey(String id) {
        return wsReportMapper.selectByPrimaryKey(id);
    }


    public int updateByPrimaryKeySelective(WsReport record) {
        return wsReportMapper.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(WsReport record) {
        return wsReportMapper.updateByPrimaryKey(record);
    }

}
