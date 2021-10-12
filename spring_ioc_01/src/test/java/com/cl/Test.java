package com.cl;

import com.cl.bean.User;
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
}
