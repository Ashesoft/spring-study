package com.longrise.spring.aop.service.impl;

import com.longrise.spring.aop.service.PersonService;

public class BoyServiceImpl implements PersonService {

    public boolean talk() {
        System.out.println("男儿当自强");
        return true;
    }
    
}