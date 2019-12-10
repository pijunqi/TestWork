package com.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.mapper.WsOrgMapper;
import com.domain.WsOrg;
@Service
public class WsOrgService{

    @Resource
    private WsOrgMapper wsOrgMapper;

    
    public int deleteByPrimaryKey(String id) {
        return wsOrgMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(WsOrg record) {
        return wsOrgMapper.insert(record);
    }

    
    public int insertSelective(WsOrg record) {
        return wsOrgMapper.insertSelective(record);
    }

    
    public WsOrg selectByPrimaryKey(String id) {
        return wsOrgMapper.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(WsOrg record) {
        return wsOrgMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(WsOrg record) {
        return wsOrgMapper.updateByPrimaryKey(record);
    }

}
