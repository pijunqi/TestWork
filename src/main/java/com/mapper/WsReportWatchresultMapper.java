package com.mapper;

import com.domain.WsReportWatchresult;

public interface WsReportWatchresultMapper {
    int deleteByPrimaryKey(String id);

    int insert(WsReportWatchresult record);

    int insertSelective(WsReportWatchresult record);

    WsReportWatchresult selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(WsReportWatchresult record);

    int updateByPrimaryKey(WsReportWatchresult record);
}