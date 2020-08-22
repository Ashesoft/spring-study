package com.longrise.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect //表示这是一个切面
public class CustomLog {
    // 切面切入的位置和方式
    @Before("execution(* com.longrise.spring.aop.service.impl.*.*(..))")
    public void first(){
        System.out.println("--- 前置方法 ---");
    }

    @After("execution(* com.longrise.spring.aop.service.impl.*.*(..))")
    public void last(){
        System.out.println("--- 后置方法 ---");
    }

    @Around("execution(* com.longrise.spring.aop.service.impl.*.*(..))")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("--- 环绕前 ---");
        Object bool = pjp.proceed();
        System.out.println("--- 环绕后 ---");
        return bool;
    }
}