package com.longrise.spring.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

/**
 * 使用 spring aop 实现日志功能
 */
public class Log implements MethodBeforeAdvice, AfterReturningAdvice {

    /**
     * 前置切入点方法
     * 
     * @param method 被调用方法对象
     * @param args   被调用的方法参数
     * @param target 被调用方法的目标对象
     */
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.printf("前置功能 ===> %s 这个类中的 %s 方法将要被执行了%n", target.getClass().getSimpleName(), method.getName());
    }
    
    /**
     * 后置切入点方法
     * 
     * @param returnValue 被调用方法的返回值
     * @param method 被调用的方法对象
     * @param args 被调用的方法参数
     * @param target 被调用方法的目标对象
     */
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.printf("后置功能 ===> %s 这个类中的 %s 方法成功被执行了, 返回的结果是:%s %n%n", target.getClass().getSimpleName(), method.getName(), returnValue);
    }

}