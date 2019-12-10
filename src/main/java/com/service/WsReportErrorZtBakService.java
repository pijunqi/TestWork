package com.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.domain.WsReportErrorZtBak;
import com.mapper.WsReportErrorZtBakMapper;
@Service
public class WsReportErrorZtBakService{

    @Resource
    private WsReportErrorZtBakMapper wsReportErrorZtBakMapper;

    
    public int deleteByPrimaryKey(String id) {
        return wsReportErrorZtBakMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(WsReportErrorZtBak record) {
        return wsReportErrorZtBakMapper.insert(record);
    }

    
    public int insertSelective(WsReportErrorZtBak record) {
        return wsReportErrorZtBakMapper.insertSelective(record);
    }

    
    public WsReportErrorZtBak selectByPrimaryKey(String id) {
        return wsReportErrorZtBakMapper.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(WsReportErrorZtBak record) {
        return wsReportErrorZtBakMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(WsReportErrorZtBak record) {
        return wsReportErrorZtBakMapper.updateByPrimaryKey(record);
    }

}
