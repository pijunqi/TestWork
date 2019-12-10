package com.mapper;

import com.domain.WsPics;

public interface WsPicsMapper {
    int deleteByPrimaryKey(String id);

    int insert(WsPics record);

    int insertSelective(WsPics record);

    WsPics selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(WsPics record);

    int updateByPrimaryKey(WsPics record);
}