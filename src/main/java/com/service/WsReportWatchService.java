package com.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.domain.WsReportWatch;
import com.mapper.WsReportWatchMapper;
@Service
public class WsReportWatchService{

    @Resource
    private WsReportWatchMapper wsReportWatchMapper;

    
    public int deleteByPrimaryKey(String id) {
        return wsReportWatchMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(WsReportWatch record) {
        return wsReportWatchMapper.insert(record);
    }

    
    public int insertSelective(WsReportWatch record) {
        return wsReportWatchMapper.insertSelective(record);
    }

    
    public WsReportWatch selectByPrimaryKey(String id) {
        return wsReportWatchMapper.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(WsReportWatch record) {
        return wsReportWatchMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(WsReportWatch record) {
        return wsReportWatchMapper.updateByPrimaryKey(record);
    }

}
