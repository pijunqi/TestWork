package com.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.domain.WsStrucTemplet1;
import com.mapper.WsStrucTemplet1Mapper;
@Service
public class WsStrucTemplet1Service{

    @Resource
    private WsStrucTemplet1Mapper wsStrucTemplet1Mapper;

    
    public int deleteByPrimaryKey(String id) {
        return wsStrucTemplet1Mapper.deleteByPrimaryKey(id);
    }

    
    public int insert(WsStrucTemplet1 record) {
        return wsStrucTemplet1Mapper.insert(record);
    }

    
    public int insertSelective(WsStrucTemplet1 record) {
        return wsStrucTemplet1Mapper.insertSelective(record);
    }

    
    public WsStrucTemplet1 selectByPrimaryKey(String id) {
        return wsStrucTemplet1Mapper.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(WsStrucTemplet1 record) {
        return wsStrucTemplet1Mapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(WsStrucTemplet1 record) {
        return wsStrucTemplet1Mapper.updateByPrimaryKey(record);
    }

}
