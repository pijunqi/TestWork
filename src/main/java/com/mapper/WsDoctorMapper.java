package com.mapper;

import com.domain.WsDoctor;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;
@Mapper
public interface WsDoctorMapper {
    int deleteByPrimaryKey(String id);

    int insert(WsDoctor record);

    int insertSelective(WsDoctor record);

    WsDoctor selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(WsDoctor record);

    int updateByPrimaryKey(WsDoctor record);

    //获取所有医生信息
    List<WsDoctor> selectAllDoctor();
}