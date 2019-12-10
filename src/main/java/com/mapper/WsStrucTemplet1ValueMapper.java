package com.mapper;

import com.domain.WsStrucTemplet1Value;

public interface WsStrucTemplet1ValueMapper {
    int deleteByPrimaryKey(String id);

    int insert(WsStrucTemplet1Value record);

    int insertSelective(WsStrucTemplet1Value record);

    WsStrucTemplet1Value selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(WsStrucTemplet1Value record);

    int updateByPrimaryKey(WsStrucTemplet1Value record);
}