package com.service;

import com.domain.WsTempletHome;
import com.mapper.WsTempletHomeMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class WsTempletHomeService {

    @Resource
    private WsTempletHomeMapper wsTempletHomeMapper;


    public int deleteByPrimaryKey(String id) {
        return wsTempletHomeMapper.deleteByPrimaryKey(id);
    }


    public int insert(WsTempletHome record) {
        return wsTempletHomeMapper.insert(record);
    }


    public int insertSelective(WsTempletHome record) {
        return wsTempletHomeMapper.insertSelective(record);
    }


    public WsTempletHome selectByPrimaryKey(String id) {
        return wsTempletHomeMapper.selectByPrimaryKey(id);
    }


    public int updateByPrimaryKeySelective(WsTempletHome record) {
        return wsTempletHomeMapper.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(WsTempletHome record) {
        return wsTempletHomeMapper.updateByPrimaryKey(record);
    }

}
