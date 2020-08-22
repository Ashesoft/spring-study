package com.longrise.spring.aop.service.impl;

import com.longrise.spring.aop.service.PersonService;

public class GirlServiceImpl implements PersonService{

    @Override
    public boolean talk() {
        System.out.println("巾帼不让须眉");
        return true;
    }
    
}