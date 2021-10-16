package com.cl;

import com.alibaba.druid.pool.DruidDataSource;
import com.cl.bean.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    @org.junit.Test
    public void testDI(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        User user1 = context.getBean("user1", User.class);
        User user2 = context.getBean("user2", User.class);
        User user3 = context.getBean("user3", User.class);
        User user4 = context.getBean("user4", User.class);

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println(user4);

    }


    @org.junit.Test
    public void testMouseAndCat(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");

        Mouse mouse = context.getBean("mouse", Mouse.class);

        Cat cat = context.getBean("cat", Cat.class);

        Cat cat2 = context.getBean("cat2", Cat.class);
        System.out.println(mouse);
        System.out.println(cat2);

    }

    @org.junit.Test
    public void testBeanList(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext4.xml");

        Student student1 = context.getBean("student1", Student.class);

        System.out.println(student1);

    }


    @org.junit.Test
    public void testBeanFactory(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext5.xml");

        Book book = context.getBean("book", Book.class);

        System.out.println(book);

    }


    @org.junit.Test
    public void testautoWireBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext6.xml");

        Emp emp = context.getBean("emp", Emp.class);

        System.out.println(emp);

    }

    @org.junit.Test
    public void testDbConnection(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext7.xml");

        DruidDataSource dataSource = context.getBean("dataSource", DruidDataSource.class);

        System.out.println(dataSource);

    }



}
