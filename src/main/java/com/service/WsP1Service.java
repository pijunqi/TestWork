package com.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.mapper.WsP1Mapper;
import com.domain.WsP1;
@Service
public class WsP1Service{

    @Resource
    private WsP1Mapper wsP1Mapper;

    
    public int insert(WsP1 record) {
        return wsP1Mapper.insert(record);
    }

    
    public int insertSelective(WsP1 record) {
        return wsP1Mapper.insertSelective(record);
    }

}
