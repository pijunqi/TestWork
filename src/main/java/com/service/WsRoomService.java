package com.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.mapper.WsRoomMapper;
import com.domain.WsRoom;
@Service
public class WsRoomService{

    @Resource
    private WsRoomMapper wsRoomMapper;

    
    public int deleteByPrimaryKey(String id) {
        return wsRoomMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(WsRoom record) {
        return wsRoomMapper.insert(record);
    }

    
    public int insertSelective(WsRoom record) {
        return wsRoomMapper.insertSelective(record);
    }

    
    public WsRoom selectByPrimaryKey(String id) {
        return wsRoomMapper.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(WsRoom record) {
        return wsRoomMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(WsRoom record) {
        return wsRoomMapper.updateByPrimaryKey(record);
    }

}
