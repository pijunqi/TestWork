package com.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.domain.WsUnstructuredTemplet;
import com.mapper.WsUnstructuredTempletMapper;
@Service
public class WsUnstructuredTempletService{

    @Resource
    private WsUnstructuredTempletMapper wsUnstructuredTempletMapper;

    
    public int deleteByPrimaryKey(String id) {
        return wsUnstructuredTempletMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(WsUnstructuredTemplet record) {
        return wsUnstructuredTempletMapper.insert(record);
    }

    
    public int insertSelective(WsUnstructuredTemplet record) {
        return wsUnstructuredTempletMapper.insertSelective(record);
    }

    
    public WsUnstructuredTemplet selectByPrimaryKey(String id) {
        return wsUnstructuredTempletMapper.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(WsUnstructuredTemplet record) {
        return wsUnstructuredTempletMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(WsUnstructuredTemplet record) {
        return wsUnstructuredTempletMapper.updateByPrimaryKey(record);
    }

}
