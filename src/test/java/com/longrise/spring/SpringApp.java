package com.longrise.spring;

import com.longrise.spring.aop.service.PersonService;
import com.longrise.spring.aop.service.UserService;
import com.longrise.spring.domain.Grade;
import com.longrise.spring.domain.Student;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class SpringApp {

    /**
     * 测试注解方法的切面(aop)
     */
    @Test
    public void testAutoAop() {
        try (ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("auto-aop.xml")) {
            PersonService boy = (PersonService) context.getBean("boy");
            boolean bool = boy.talk();
            System.out.println(bool);
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }

    /**
     * 方法前置切入点
     */
    @Test
    public void testBeforeAop() {
        try (ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("aop.xml")) {
            UserService userService = (UserService) context.getBean("userService");
            userService.create();
            // userService.read();
            // userService.update();
            // userService.delete();
            PersonService boy = (PersonService) context.getBean("boy");
            boy.talk();
            PersonService girl = (PersonService) context.getBean("girl");
            girl.talk();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 测试使用 spring 容器创建管理对象
     */
    @Test
    public void testCreateBean() {
        try (ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")) {
            Grade grade = (Grade) context.getBean("grade");
            System.out.println(grade);
            Student stu = (Student) context.getBean("student");
            System.out.println(stu);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
