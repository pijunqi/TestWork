package com.mapper;

import com.domain.WsTemplet;

public interface WsTempletMapper {
    int deleteByPrimaryKey(String id);

    int insert(WsTemplet record);

    int insertSelective(WsTemplet record);

    WsTemplet selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(WsTemplet record);

    int updateByPrimaryKey(WsTemplet record);
}