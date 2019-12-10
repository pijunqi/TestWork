package com.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.domain.WsPatient;
import com.mapper.WsPatientMapper;
@Service
public class WsPatientService{

    @Resource
    private WsPatientMapper wsPatientMapper;

    
    public int deleteByPrimaryKey(String id) {
        return wsPatientMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(WsPatient record) {
        return wsPatientMapper.insert(record);
    }

    
    public int insertSelective(WsPatient record) {
        return wsPatientMapper.insertSelective(record);
    }

    
    public WsPatient selectByPrimaryKey(String id) {
        return wsPatientMapper.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(WsPatient record) {
        return wsPatientMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(WsPatient record) {
        return wsPatientMapper.updateByPrimaryKey(record);
    }

}
