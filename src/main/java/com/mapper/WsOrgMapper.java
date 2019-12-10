package com.mapper;

import com.domain.WsOrg;

public interface WsOrgMapper {
    int deleteByPrimaryKey(String id);

    int insert(WsOrg record);

    int insertSelective(WsOrg record);

    WsOrg selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(WsOrg record);

    int updateByPrimaryKey(WsOrg record);
}