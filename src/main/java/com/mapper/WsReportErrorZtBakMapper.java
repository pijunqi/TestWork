package com.mapper;

import com.domain.WsReportErrorZtBak;

public interface WsReportErrorZtBakMapper {
    int deleteByPrimaryKey(String id);

    int insert(WsReportErrorZtBak record);

    int insertSelective(WsReportErrorZtBak record);

    WsReportErrorZtBak selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(WsReportErrorZtBak record);

    int updateByPrimaryKey(WsReportErrorZtBak record);
}