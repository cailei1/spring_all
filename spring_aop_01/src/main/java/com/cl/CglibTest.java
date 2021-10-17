package com.cl;

import org.junit.Test;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibTest {


    @Test
    public void testCglib() {

        final Person2 person2 = new Person2("小菜");
        // 1.获取一个enhance 对象
        // 2.设置父类的字节码
        // 3.获取MethodIntercepter 对象
        // 4.获取代理对象 完成功能

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Person2.class);
        MethodInterceptor methodInterceptor = new MethodInterceptor() {
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                // Object o 生成的代理对象
                // Method method 父类中的要被重写的方法
                // Object[] objects 方法在调用的时候传入的实参
                // MethodProxy methodProxy 子类中的重写方法

                Object res = null;
                if(method.getName().equals("eat")){
                    System.out.println("饭钱洗手");
                    res = methodProxy.invokeSuper(o,objects);
                    System.out.println("饭后刷牙");
                }else{
                    // 如果是其他方法不增强
                    res = methodProxy.invokeSuper(o,objects);
                }




                return res;
            }
        };
        // 设置 methodInterceptor
        enhancer.setCallback(methodInterceptor);
        Person2 proxy = (Person2) enhancer.create();


        proxy.eat("饺子");

    }
}


class Person2 {
    private String name;

    public Person2() {
    }

    public Person2(String name) {
        this.name = name;
    }


    public void eat(String foodName) {
        System.out.println(name + foodName);
    }
}