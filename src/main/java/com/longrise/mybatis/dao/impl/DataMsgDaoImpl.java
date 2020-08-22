package com.longrise.mybatis.dao.impl;

import java.util.List;

import com.longrise.mybatis.dao.DataMsgDao;
import com.longrise.mybatis.entity.DataMsg;

import org.mybatis.spring.SqlSessionTemplate;

public class DataMsgDaoImpl implements DataMsgDao {

    private SqlSessionTemplate sessionTemplate;

    /**
     * @param sessionTemplate the sessionTemplate to set
     */
    public void setSessionTemplate(SqlSessionTemplate sessionTemplate) {
        this.sessionTemplate = sessionTemplate;
    }

    @Override
    public List<DataMsg> queryAll() {
        return sessionTemplate.selectList("com.longrise.mybatis.mapper.queryAll");
    }

    @Override
    public DataMsg queryOne(int id) {
        return sessionTemplate.selectOne("com.longrise.mybatis.mapper.queryOne", id);
    }

    @Override
    public DataMsg addOne(DataMsg dataMsg) {
        sessionTemplate.insert("com.longrise.mybatis.mapper.addOne", dataMsg);
        // 因为再 xml 中配置了 useGeneratedKeys 和 keyProperty 
        // <insert id="addOne" parameterType="DataMsg" useGeneratedKeys="true" keyProperty="id">
        return queryOne(dataMsg.getId());
    }

    @Override
    public DataMsg postOne(DataMsg dataMsg) {
        sessionTemplate.update("com.longrise.mybatis.mapper.postOne", dataMsg);
        return queryOne(dataMsg.getId());
    }

    @Override
    public boolean rmvOne(int id) {
        int num = sessionTemplate.delete("com.longrise.mybatis.mapper.rmvOne", id);
        return num >= 1;
    }

    @Override
    public void testTx() {
        DataMsg dataMsg = new DataMsg();
        dataMsg.setMsg("面朝大海");
        addOne(dataMsg);
        sessionTemplate.delete("com.longrise.mybatis.mapper.testRmove", 1);
    }
    
}