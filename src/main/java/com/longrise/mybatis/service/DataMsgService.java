package com.longrise.mybatis.service;

import java.util.List;

import com.longrise.mybatis.entity.DataMsg;

public interface DataMsgService {
    List<DataMsg> queryAll();
}