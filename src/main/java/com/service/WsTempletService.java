package com.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.mapper.WsTempletMapper;
import com.domain.WsTemplet;
@Service
public class WsTempletService{

    @Resource
    private WsTempletMapper wsTempletMapper;

    
    public int deleteByPrimaryKey(String id) {
        return wsTempletMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(WsTemplet record) {
        return wsTempletMapper.insert(record);
    }

    
    public int insertSelective(WsTemplet record) {
        return wsTempletMapper.insertSelective(record);
    }

    
    public WsTemplet selectByPrimaryKey(String id) {
        return wsTempletMapper.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(WsTemplet record) {
        return wsTempletMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(WsTemplet record) {
        return wsTempletMapper.updateByPrimaryKey(record);
    }

}
