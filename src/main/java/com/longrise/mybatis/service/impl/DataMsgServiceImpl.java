package com.longrise.mybatis.service.impl;

import java.util.List;

import com.longrise.mybatis.entity.DataMsg;
import com.longrise.mybatis.service.DataMsgService;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class DataMsgServiceImpl extends SqlSessionDaoSupport implements DataMsgService {

    @Override
    public List<DataMsg> queryAll() {
        return super.getSqlSession().selectList("com.longrise.mybatis.mapper.queryAll");
    }
    
}