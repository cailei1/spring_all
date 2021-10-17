package com.cl.bean.dao.Impl;

import com.cl.bean.dao.UserDao;
import org.springframework.stereotype.Repository;


@Repository
public class UserDao1Impl implements UserDao {


    public void addUser() {
        System.out.println("UserDao1 add data");

    }
}
