package com.cl;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// JDK 自带Proxy 动态代理
public class ProxyTest {

    public static void main(String[] args) {
       final Person1 person1 = new Person1("张三");
//       person1.eat("饺子");


     Dinner proxy = (Dinner) Proxy.newProxyInstance(person1.getClass().getClassLoader(), person1.getClass().getInterfaces(),new InvocationHandler(){

            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                Object res = null;

                if(method.getName().equals("eat")){
                    // 让原有的eat 执行
                    System.out.println("先洗手");
                    res = method.invoke(person1,args);
                    System.out.println("吃完刷碗");
                }else{
                    res = method.invoke(person1,args);
                }

                return res;
            }
        });
     proxy.eat("饺子");
    }
}


class Person1 implements Dinner {

    private String name;


    public Person1(String name) {
        this.name = name;
    }

    public void eat(String foodName) {
        System.out.println(name+"正在吃"+foodName);
    }

    public void drink(String water) {
        System.out.println(name+"正在喝"+water);

    }
}

interface Dinner{
    void eat(String foodName);
    void drink(String water);
}