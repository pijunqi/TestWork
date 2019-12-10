package com.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.mapper.WsSysUserMapper;
import com.domain.WsSysUser;
@Service
public class WsSysUserService{

    @Resource
    private WsSysUserMapper wsSysUserMapper;

    
    public int deleteByPrimaryKey(String id) {
        return wsSysUserMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(WsSysUser record) {
        return wsSysUserMapper.insert(record);
    }

    
    public int insertSelective(WsSysUser record) {
        return wsSysUserMapper.insertSelective(record);
    }

    
    public WsSysUser selectByPrimaryKey(String id) {
        return wsSysUserMapper.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(WsSysUser record) {
        return wsSysUserMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(WsSysUser record) {
        return wsSysUserMapper.updateByPrimaryKey(record);
    }

}
