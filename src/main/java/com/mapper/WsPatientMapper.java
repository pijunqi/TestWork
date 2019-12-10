package com.mapper;

import com.domain.WsPatient;

public interface WsPatientMapper {
    int deleteByPrimaryKey(String id);

    int insert(WsPatient record);

    int insertSelective(WsPatient record);

    WsPatient selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(WsPatient record);

    int updateByPrimaryKey(WsPatient record);
}