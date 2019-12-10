package com.mapper;

import com.domain.WsUnstructuredTemplet;

public interface WsUnstructuredTempletMapper {
    int deleteByPrimaryKey(String id);

    int insert(WsUnstructuredTemplet record);

    int insertSelective(WsUnstructuredTemplet record);

    WsUnstructuredTemplet selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(WsUnstructuredTemplet record);

    int updateByPrimaryKey(WsUnstructuredTemplet record);
}