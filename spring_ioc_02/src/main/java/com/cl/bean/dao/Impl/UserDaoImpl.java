package com.cl.bean.dao.Impl;

import com.cl.bean.dao.UserDao;
import org.springframework.stereotype.Repository;


@Repository
public class UserDaoImpl implements UserDao {
    public void addUser() {
        System.out.println("UserDao add data");
    }
}
