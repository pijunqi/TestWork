package com.mapper;

import com.domain.WsStrucTemplet1;

public interface WsStrucTemplet1Mapper {
    int deleteByPrimaryKey(String id);

    int insert(WsStrucTemplet1 record);

    int insertSelective(WsStrucTemplet1 record);

    WsStrucTemplet1 selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(WsStrucTemplet1 record);

    int updateByPrimaryKey(WsStrucTemplet1 record);
}