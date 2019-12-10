package com.mapper;

import com.domain.WsStrucDiagnosisTemplet;

public interface WsStrucDiagnosisTempletMapper {
    int deleteByPrimaryKey(String id);

    int insert(WsStrucDiagnosisTemplet record);

    int insertSelective(WsStrucDiagnosisTemplet record);

    WsStrucDiagnosisTemplet selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(WsStrucDiagnosisTemplet record);

    int updateByPrimaryKey(WsStrucDiagnosisTemplet record);
}