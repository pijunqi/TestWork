package com.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.mapper.WsStrucTemplet1ValueMapper;
import com.domain.WsStrucTemplet1Value;
@Service
public class WsStrucTemplet1ValueService{

    @Resource
    private WsStrucTemplet1ValueMapper wsStrucTemplet1ValueMapper;

    
    public int deleteByPrimaryKey(String id) {
        return wsStrucTemplet1ValueMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(WsStrucTemplet1Value record) {
        return wsStrucTemplet1ValueMapper.insert(record);
    }

    
    public int insertSelective(WsStrucTemplet1Value record) {
        return wsStrucTemplet1ValueMapper.insertSelective(record);
    }

    
    public WsStrucTemplet1Value selectByPrimaryKey(String id) {
        return wsStrucTemplet1ValueMapper.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(WsStrucTemplet1Value record) {
        return wsStrucTemplet1ValueMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(WsStrucTemplet1Value record) {
        return wsStrucTemplet1ValueMapper.updateByPrimaryKey(record);
    }

}
