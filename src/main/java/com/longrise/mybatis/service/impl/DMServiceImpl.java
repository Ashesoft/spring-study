package com.longrise.mybatis.service.impl;

import java.util.List;

import com.longrise.mybatis.dao.DataMsgMapper;
import com.longrise.mybatis.entity.DataMsg;
import com.longrise.mybatis.service.DMService;

public class DMServiceImpl implements DMService {
    private DataMsgMapper dataMsgMapper;

    /**
     * @param dataMsgMapper the dataMsgMapper to set
     */
    public void setDataMsgMapper(DataMsgMapper dataMsgMapper) {
        this.dataMsgMapper = dataMsgMapper;
    }

    @Override
    public List<DataMsg> getAll() {
        return dataMsgMapper.getAll();
    }
    
}