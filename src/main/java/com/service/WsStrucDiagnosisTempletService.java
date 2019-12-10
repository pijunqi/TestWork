package com.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.domain.WsStrucDiagnosisTemplet;
import com.mapper.WsStrucDiagnosisTempletMapper;
@Service
public class WsStrucDiagnosisTempletService{

    @Resource
    private WsStrucDiagnosisTempletMapper wsStrucDiagnosisTempletMapper;

    
    public int deleteByPrimaryKey(String id) {
        return wsStrucDiagnosisTempletMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(WsStrucDiagnosisTemplet record) {
        return wsStrucDiagnosisTempletMapper.insert(record);
    }

    
    public int insertSelective(WsStrucDiagnosisTemplet record) {
        return wsStrucDiagnosisTempletMapper.insertSelective(record);
    }

    
    public WsStrucDiagnosisTemplet selectByPrimaryKey(String id) {
        return wsStrucDiagnosisTempletMapper.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(WsStrucDiagnosisTemplet record) {
        return wsStrucDiagnosisTempletMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(WsStrucDiagnosisTemplet record) {
        return wsStrucDiagnosisTempletMapper.updateByPrimaryKey(record);
    }

}
