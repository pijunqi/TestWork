package com.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.domain.WsDoctor0827;
import com.mapper.WsDoctor0827Mapper;
@Service
public class WsDoctor0827Service{

    @Resource
    private WsDoctor0827Mapper wsDoctor0827Mapper;

    
    public int insert(WsDoctor0827 record) {
        return wsDoctor0827Mapper.insert(record);
    }

    
    public int insertSelective(WsDoctor0827 record) {
        return wsDoctor0827Mapper.insertSelective(record);
    }

}
