package com.longrise.spring.aop.service.impl;

import com.longrise.spring.aop.service.UserService;

public class UserServiceImpl implements UserService{

    @Override
    public void create() {
        System.out.println("新增了一个用户");
    }

    @Override
    public void read() {
        System.out.println("获取了一个用户");
    }
    
    @Override
    public void update() {
        System.out.println("修改了一个用户");
    }
    
    @Override
    public void delete() {
        System.out.println("删除了一个用户");
    }

}