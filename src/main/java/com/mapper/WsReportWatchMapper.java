package com.mapper;

import com.domain.WsReportWatch;

public interface WsReportWatchMapper {
    int deleteByPrimaryKey(String id);

    int insert(WsReportWatch record);

    int insertSelective(WsReportWatch record);

    WsReportWatch selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(WsReportWatch record);

    int updateByPrimaryKey(WsReportWatch record);
}