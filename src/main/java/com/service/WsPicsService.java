package com.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.mapper.WsPicsMapper;
import com.domain.WsPics;
@Service
public class WsPicsService{

    @Resource
    private WsPicsMapper wsPicsMapper;

    
    public int deleteByPrimaryKey(String id) {
        return wsPicsMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(WsPics record) {
        return wsPicsMapper.insert(record);
    }

    
    public int insertSelective(WsPics record) {
        return wsPicsMapper.insertSelective(record);
    }

    
    public WsPics selectByPrimaryKey(String id) {
        return wsPicsMapper.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(WsPics record) {
        return wsPicsMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(WsPics record) {
        return wsPicsMapper.updateByPrimaryKey(record);
    }

}
