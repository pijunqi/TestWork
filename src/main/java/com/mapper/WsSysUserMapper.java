package com.mapper;

import com.domain.WsSysUser;

public interface WsSysUserMapper {
    int deleteByPrimaryKey(String id);

    int insert(WsSysUser record);

    int insertSelective(WsSysUser record);

    WsSysUser selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(WsSysUser record);

    int updateByPrimaryKey(WsSysUser record);
}