package com.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.domain.WsReportWatchresult;
import com.mapper.WsReportWatchresultMapper;
@Service
public class WsReportWatchresultService{

    @Resource
    private WsReportWatchresultMapper wsReportWatchresultMapper;

    
    public int deleteByPrimaryKey(String id) {
        return wsReportWatchresultMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(WsReportWatchresult record) {
        return wsReportWatchresultMapper.insert(record);
    }

    
    public int insertSelective(WsReportWatchresult record) {
        return wsReportWatchresultMapper.insertSelective(record);
    }

    
    public WsReportWatchresult selectByPrimaryKey(String id) {
        return wsReportWatchresultMapper.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(WsReportWatchresult record) {
        return wsReportWatchresultMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(WsReportWatchresult record) {
        return wsReportWatchresultMapper.updateByPrimaryKey(record);
    }

}
