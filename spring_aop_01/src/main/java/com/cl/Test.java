package com.cl;

public class Test {


    public static void main(String[] args) {
        Person person = new Person("张安");
//        person.doCourt();

        Lawyer layer = new Lawyer(person);
        layer.doCourt();
    }
}


interface Court{

    // 打官司
    void doCourt();
}


class Lawyer implements Court{
    private Person person;

    public void doCourt() {
        System.out.println("我是律师我代理张安来答辩");
        person.doCourt();
        System.out.println("答辩完毕");
    }

    public Lawyer(Person person) {
        this.person  = person;
    }


}


class Person implements Court{

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void doCourt() {
        System.out.println(name+"说我没有犯法");
    }
}