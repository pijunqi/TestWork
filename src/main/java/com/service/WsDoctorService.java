package com.service;

import com.domain.WsDoctor;
import com.mapper.WsDoctorMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class WsDoctorService{

    @Resource
    private WsDoctorMapper wsDoctorMapper;


    public int deleteByPrimaryKey(String id) {
        return wsDoctorMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(WsDoctor record) {
        return wsDoctorMapper.insert(record);
    }

    
    public int insertSelective(WsDoctor record) {
        return wsDoctorMapper.insertSelective(record);
    }

    
    public WsDoctor selectByPrimaryKey(String id) {
        return wsDoctorMapper.selectByPrimaryKey(id);
    }


    public List<WsDoctor> selectAllDoctor() {
        return wsDoctorMapper.selectAllDoctor();
    }

    
    public int updateByPrimaryKeySelective(WsDoctor record) {
        return wsDoctorMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(WsDoctor record) {
        return wsDoctorMapper.updateByPrimaryKey(record);
    }

}
