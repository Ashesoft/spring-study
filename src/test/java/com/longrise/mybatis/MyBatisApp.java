package com.longrise.mybatis;

import com.longrise.mybatis.dao.DataMsgDao;
import com.longrise.mybatis.service.DMService;
import com.longrise.mybatis.service.DataMsgService;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyBatisApp {
    /**
     * 注解版测试
     */
    @Test
    public void testAnnotationSql(){
        try (ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring-annotation.xml")) {
            DMService dMService = (DMService) context.getBean("dMService");
            System.out.println(dMService.getAll()); 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * SqlSessionDaoSupport 的使用, 简化配置
     */
    @Test
    public void testSqlSessionDaoSupport(){
        try (ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring-new.xml")) {
            DataMsgService dataMsgService = (DataMsgService) context.getBean("dataMsgService");
            System.out.println(dataMsgService.queryAll()); 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 测试整合后的 spring 事务
     */
    @Test
    public void testTxMyBatis() {
        try (ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring.xml")) {
            DataMsgDao dataMsgDao = (DataMsgDao) context.getBean("dataMsgDao");
            dataMsgDao.testTx(); // 事务ok
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 测试 spring 整合 mybatis 是否成功(CRUD)
     */
    @Test
    public void testMyBatis() {
        try (ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring.xml")) {
            DataMsgDao dataMsgDao = (DataMsgDao) context.getBean("dataMsgDao");
            // System.out.println(dataMsgDao.queryAll());
            // System.out.println(dataMsgDao.addOne(new DataMsg(){{setMsg("hello world!");}}));
            // System.out.println(dataMsgDao.queryOne(11));
            // System.out.println(dataMsgDao.postOne(new DataMsg(){{setId(10);setMsg("春暖花开");}}));
            System.out.println(dataMsgDao.rmvOne(18)); 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}