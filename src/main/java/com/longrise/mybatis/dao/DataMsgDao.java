package com.longrise.mybatis.dao;

import java.util.List;

import com.longrise.mybatis.entity.DataMsg;

public interface DataMsgDao {
    /**
     * 查全部
     */
    List<DataMsg> queryAll();

    /**
     * 查一个
     */
    DataMsg queryOne(int id);
    
    /**
     * 添加一个
     */
    DataMsg addOne(DataMsg dataMsg);

    /**
     * 修改一个
     */
    DataMsg postOne(DataMsg dataMsg);

    /**
     * 删除一个
     */
    boolean rmvOne(int id);

    /**
     * 测试配置的 事务
     * @return
     */
    void testTx();
}