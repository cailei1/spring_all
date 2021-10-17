package com.cl.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DaoAdvice {


    @Before("execution(* com.cl.dao.impl.UserDaoImpl.addUser(..))")
    public void methodBefore(){
        System.out.println("执行前置方法");
    }
}
