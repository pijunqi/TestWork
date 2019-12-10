package com.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.mapper.WsSysUser0827Mapper;
import com.domain.WsSysUser0827;
@Service
public class WsSysUser0827Service{

    @Resource
    private WsSysUser0827Mapper wsSysUser0827Mapper;

    
    public int insert(WsSysUser0827 record) {
        return wsSysUser0827Mapper.insert(record);
    }

    
    public int insertSelective(WsSysUser0827 record) {
        return wsSysUser0827Mapper.insertSelective(record);
    }

}
