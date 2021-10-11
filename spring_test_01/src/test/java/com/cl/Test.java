package com.cl;

import com.cl.dao.EmpDao;
import com.cl.impl.EmpDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {


    @org.junit.Test
    public void testBean(){
        EmpDao dao = new EmpDaoImpl();

        dao.addEmp();
    }


    @org.junit.Test
    public void testSpringBean(){
        //获取容器
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        EmpDao empDao = (EmpDao) context.getBean("empDao");

        empDao.addEmp();

    }
}
