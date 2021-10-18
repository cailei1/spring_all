package com.cl.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class DaoAdvice {


    // 公共切点
    @Pointcut("execution(* com.cl.dao.impl.UserDaoImpl.addUser(..))")
    public void publicPoint(){}


    // 直接写接口的方法
    @Pointcut("execution(* com.cl.dao.UserDao.addUser(..))")
    public void interfacePoint(){}

    @Before("publicPoint()")
    public void methodBefore(JoinPoint joinPoint){

        Object[] args = joinPoint.getArgs();

        System.out.println(Arrays.toString(args));

        System.out.println("执行前置方法");
    }


//    无论前置通知是否出现异常，都会执行 也叫最终通知
    @After("publicPoint()")
    public void methodAfter(JoinPoint joinPoint){

        Object[] args = joinPoint.getArgs();

        System.out.println(Arrays.toString(args));

        System.out.println("执行后置方法");
    }



    // 返回结果后执行
    @AfterReturning(value = "publicPoint()",returning = "res")
    public void methodReturning(JoinPoint joinPoint,Object res){

        System.out.println("method afterReturning");
        System.out.println(res);
    }


    // 切点出错后执行
    @AfterThrowing(value = "publicPoint()",throwing = "ex")
    public void methodAfterThrowing(Exception ex){
        System.out.println("method afterthrowing invoke");
        System.out.println(ex);
    }

    // 环绕通知  切点方法之前和之后 都进行功能的增强


    @Around(value = "publicPoint()")
    public Object methodAroud(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("执行环绕前置通知");
        Object res = proceedingJoinPoint.proceed();
        System.out.println("执行2环绕后置通知");

        return res;

    }


}
