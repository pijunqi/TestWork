package com.mapper;

import com.domain.WsReport;

public interface WsReportMapper {
    int deleteByPrimaryKey(String id);

    int insert(WsReport record);

    int insertSelective(WsReport record);

    WsReport selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(WsReport record);

    int updateByPrimaryKey(WsReport record);
}