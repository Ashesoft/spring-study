package com.longrise.mybatis.dao;

import java.util.List;

import com.longrise.mybatis.entity.DataMsg;

import org.apache.ibatis.annotations.Select;
public interface DataMsgMapper {
    @Select("select * from datamsg")
    public List<DataMsg> getAll();
    
}