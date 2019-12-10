package com.mapper;

import com.domain.WsDoctor;

public interface WsDoctorMapper {
    int deleteByPrimaryKey(String id);

    int insert(WsDoctor record);

    int insertSelective(WsDoctor record);

    WsDoctor selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(WsDoctor record);

    int updateByPrimaryKey(WsDoctor record);
}