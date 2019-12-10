package com.mapper;

import com.domain.WsRoom;

public interface WsRoomMapper {
    int deleteByPrimaryKey(String id);

    int insert(WsRoom record);

    int insertSelective(WsRoom record);

    WsRoom selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(WsRoom record);

    int updateByPrimaryKey(WsRoom record);
}