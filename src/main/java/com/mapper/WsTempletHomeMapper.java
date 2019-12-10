package com.mapper;

import com.domain.WsTempletHome;

public interface WsTempletHomeMapper {
    int deleteByPrimaryKey(String id);

    int insert(WsTempletHome record);

    int insertSelective(WsTempletHome record);

    WsTempletHome selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(WsTempletHome record);

    int updateByPrimaryKey(WsTempletHome record);
}